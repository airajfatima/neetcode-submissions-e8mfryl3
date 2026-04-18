class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        ArrayList<float[]> list = new ArrayList<>();
        int n = position.length;
        for(int i = 0; i < n; i++){
            float[] pair = new float[]{position[i], speed[i]};
            list.add(pair);
        }
        Collections.sort(list, (a, b) -> Float.compare(b[0], a[0]));
        int fleet = 1;
        float prevTime = ((float)target - list.get(0)[0])/ list.get(0)[1];
        for(int i = 1; i < n; i++){
            float currTime = ((float)target - list.get(i)[0])/ list.get(i)[1];
            if(currTime > prevTime){
                fleet++;
                prevTime = currTime;
            }
        }
        return fleet;
                
    }
}
