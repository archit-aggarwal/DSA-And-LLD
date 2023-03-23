class Solution {
public:
    int maxPoints(vector<vector<int>>& points) {
        if(points.size() == 1) return 1;
        unordered_map<double, unordered_map<double, unordered_set<int>>> m;
        // For One Given Slope, There can be multiple parallel lines.
        // To Differentiate b/w Parallel Lines, Take Pd. Distance from Origin.
        for(int i=0; i<points.size(); i++)
        {
            for(int j=i+1; j<points.size(); j++)
            {
                double slope;
                if(points[j][0] == points[i][0])
                    slope = INT_MAX * 1.0;
                else slope = 
                (points[j][1] - 1.0 * points[i][1])/(points[j][0] - points[i][0]);
                
                double dist = 0;
                if(points[j][0] == points[i][0])
                    dist = 1.0 * points[i][0];
                else
                {
                    dist = 1.0 * points[i][1] - slope * points[i][0];
                    dist = dist/(sqrt(1.0 + slope*slope));
                }
                
                m[slope][dist].insert(i);
                m[slope][dist].insert(j);
            }
        }
        int ans = 1;
        for(auto s: m)
        {
            for(auto d: s.second)
                ans = max(ans, (int) d.second.size());
        }
        return ans;
    }
};