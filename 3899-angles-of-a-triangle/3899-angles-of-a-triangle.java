class Solution {
    public boolean validTriangle(int[] sides){
        if(sides[0]+sides[1]<=sides[2]) return false;
        if(sides[0]+sides[2]<=sides[1]) return false;
        if(sides[1]+sides[2]<=sides[0]) return false;
        return true;
    }
    public double[] internalAngles(int[] sides) {
        if(validTriangle(sides)==false){
            return new double[]{};
        }
        double[] ans=new double[3];
        double a=sides[0],b=sides[1],c=sides[2];
        ans[0]=Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
        ans[1]=Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
        ans[2]=Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
        Arrays.sort(ans);
        return ans;
    }
}