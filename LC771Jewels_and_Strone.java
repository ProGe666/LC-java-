class LC771{
    public int numJeweIsInStones(String J,String S){
        boolean [] isJ = new boolean[128];
        for(char c: J.toCharArray()){
            isJ[c]  = true;
        }
        int count = 0;
        for(char c: S.toCharArray()){
            if(isJ[c])
            count++;
        }
        return count;
    }
}