import java.util.*;
// https://leetcode.com/problems/car-fleet/description/
// Time = O(N Log N), Space = O(N) Extra Space

class Solution {
    public static class Car implements Comparable<Car> {
        double distance, time;

        Car(int speed, int position, int target) {
            this.distance = (target - position);
            this.time = this.distance / speed;
        }

        public int compareTo(Car other) {
            return (int) (this.distance - other.distance);
        }
    }

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        Car[] cars = new Car[n];
        for (int i = 0; i < n; i++)
            cars[i] = new Car(speed[i], position[i], target);

        Arrays.sort(cars);
        double maxTime = 0;
        int fleet = 0;

        for (Car car : cars) {
            if (car.time > maxTime) {
                fleet++;
                maxTime = car.time;
            }
        }
        return fleet;
    }
}