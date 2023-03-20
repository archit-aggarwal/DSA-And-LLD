import java.util.*;

// interface ICamera {
//     void clickPicture(); // public, abstract

//     void open();

//     // Default Method (public access modifer)
//     default void lens() {
//         System.out.println("Camera have a lens");
//     }

//     static void zoom() {
//         System.out.println("Camera Zoom");
//     }
// }

// interface ICall {
//     public void call();

//     public void open();
// }

// interface IVideoCall extends ICall {
//     // public void call();
//     // public void open();
//     public void videoChat();
// }

// abstract class Torch {
//     public void open() {
//         System.out.println("Torch On/Off");
//     }
// }

// class MobilePhone extends Torch implements ICamera, IVideoCall {
//     @Override
//     public void clickPicture() {
//         System.out.println("Click Picture");
//     }

//     @Override
//     public void call() {
//         System.out.println("Audio or Video Call");
//     }

//     @Override
//     public void open() {
//         super.open(); // Torch
//         System.out.println("Open the Mobile Phone");
//     }

//     @Override
//     public void videoChat() {
//         System.out.println("Video Chat");
//     }
// }

// public class App {
//     static String industry = "Bollywood";

//     public static void main(String[] args) {
//         ICamera p1 = new MobilePhone();
//         p1.clickPicture();
//         p1.open();

//         ICall p2 = new MobilePhone();
//         p2.call();
//         p2.open();

//         IVideoCall p5 = new MobilePhone();
//         p5.videoChat();

//         MobilePhone p3 = new MobilePhone();
//         p3.clickPicture();
//         p3.open();
//         p3.call();

//         Torch p4 = new MobilePhone();
//         p4.open();

//         ICamera.zoom();

//         App.Inner obj = new App.Inner();
//     }
// }

public class App {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -5, -17, -17, -17, -5, 3, 9, 12, 1000, -1000, 999, -1000, 0 };
        // 4, 7, 4, 11, 2, 7, 7

        // 2, 3, 2, 1, 1, 3, 3

        // freq of 2 = 2 => 2 / 2 = 1 * 2  
        // freq of 3 = 3 => 3 / 3 = 1 * 3 
        // freq of 1 = 2 => 2 / 1 = 2 * 1
        // 2 + 3 + 2 = 7

        // 4, 4, 7, 7, 7, 11, 2,

        // freq: 2, 3, 3, 3, 2, 2, 2
        // lexi: 1, 2, 2, 2, 1, 3, 3

        // 2 * 2 + 3 * 1 = 7
        // sum of freq of everyone in freq

        // 1, 2, 4
        // freq of 1 = 1 => 1 / 1 = 1
        // freq of 2 = 1 => 1 / 2 = 0
        // freq of 4 = 1 => 1 / 4 = 0
        // 1 * 1 + 0 * 2 + 0 * 4 = 1

        // 1 + 1 + 1

        // 2 elements of 2 freq, 1 element of 3 freq
        // HashMap: 2: {1, 3}, 3: {2}

        // if(sum of unique freq != freq.length) return -1;

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] freq = new int[n];
        for (int idx = 0; idx < n; idx++) {
            freq[idx] = scn.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        {}
        int count = 1, sum = 0;

        for (int val : freq) {
            if (hm.containsKey(val) == false) {
                hm.put(val, count);
                count++;
                sum += val;
            }
        }

        if (sum != freq.length) {
            System.out.print(-1);
            return;
        }

        for (int val : freq) {
            System.out.print(hm.get(val) + " ");
        }

        // 1, 1, 1, 1, 1
        // 1, 2, 3, 4, 5

        // 1, 2, 4
        // -1

        // int[] freq = new int[2005];
        // int min = -1000;

        // for (int val : arr) {
        // int idx = val - min;
        // freq[idx]++;
        // }

        // for (int idx = 0; idx < 2005; idx++) {
        // if (freq[idx] > 0) {
        // System.out.println(idx + min + ": " + freq[idx]);
        // }
        // }
    }
}