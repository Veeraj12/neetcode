class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for(int i=0; i<strs.size(); i++){
            int tempSize = strs.get(i).length();

            encodedString += tempSize +  "#" + strs.get(i);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedL = new ArrayList<>();

        int len = str.length();
        int i = 0;
        while(i < len){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            j++;

            String word = str.substring(j, j+length);
            decodedL.add(word);

            i = j + length;
        }        
        return decodedL;
    }

}
