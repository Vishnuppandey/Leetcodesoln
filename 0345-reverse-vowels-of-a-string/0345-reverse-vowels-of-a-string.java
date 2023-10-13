class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> st =new HashSet<>();
        StringBuffer sb =new StringBuffer(s);
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');
        st.add('A');
        st.add('E');
        st.add('I');
        st.add('O');
        st.add('U'); 
        int i=0;
        int j=s.length()-1;
       while(i<j){
            if(st.contains(s.charAt(i))&&st.contains(s.charAt(j))){
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,s.charAt(i));
            i++;
            j--;
            }
            else if(st.contains(s.charAt(i))&&!st.contains(s.charAt(j))){ 
                j--;
            }
             else if(!st.contains(s.charAt(i))&&st.contains(s.charAt(j))){ 
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return sb.toString();
    }
}