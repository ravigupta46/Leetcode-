class Solution {
    public int passwordStrength(String password) {
        Set<Character> st=new HashSet<>();
        Set<Character> sp=new HashSet<>();
        int count=0;
        for(char c:password.toCharArray()){
            if(!st.contains(c)&& (c!='!'||c!='@'||c!='#'||c!='$')){
                if(Character.isDigit(c)){
                    count+=3;
            }
                else if(Character.isLowerCase(c)){
                    count+=1;
                }
                else{
                    if(Character.isUpperCase(c)){
                        count+=2;
                    }
                }
                st.add(c);
            }
            if(!sp.contains(c)&& (c=='!'||c=='@'||c=='#'||c=='$')){
                count+=5;
                sp.add(c);
            }

        }
        return count;
    }
}