class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // target = 10, position = [4,1,0,7], speed = [2,2,1,1]
    //    Deque<double> stack = new ArrayDeque<>();
          double previousFleet = 0;
          int count = 0;
        //4, 2
        double [][] cars = new double[position.length][2];
        for(int i=0; i<position.length; i++){
            cars[i][0] = (double)position[i];
            cars[i][1] = (double)speed[i];
        }
        /*cars = {
            [4.0, 2.0], [1.0, 2.0],
            [0.0, 1.0], [7.0, 1.0]
        }
        */
        Arrays.sort( cars, (a,b) -> Double.compare(b[0], a[0]));
        /*
            [7.0, 1.0], [4.0, 2.0], [1.0, 2.0], [0.0, 1.0]
        */

       for(double [] car : cars){
            // 10 - 7.0 / 1.0 -> 3.0
            // 10 - 4.0 / 2.0 -> 3.0
            // 10 - 1.0 / 2.0 -> 4.5
            // 10 - 0.0 / 1.0 -> 10.0
            double time = (target - car[0]) / car[1];
            if(previousFleet == 0.0){ // T F F F
                // stack.push(time);// 3.0
                previousFleet = time;
                count++;
            }else{
                // 3.0 > 3.0 = F
                // 4.5 > 3.0 = T 
                // 10.0 > 4.5 = T
                // if(time > stack.peek()){  
                //     stack.push(time); //[10.0, 4.5, 3.0]
                // }
                if(time > previousFleet){
                    previousFleet = time;
                    count++;
                }
            }
       } 

    //    return stack.size();// 3
       return count;// 3

    }
}
