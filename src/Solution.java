class Solution {
    public static void main(String[] args) {
        System.out.println(maximum69Number(6669));
    }
    public static int maximum69Number (int num) {
        StringBuilder strNum = new StringBuilder();
        strNum.append(num);
        for(int i = 0; i < strNum.length(); i++){
            if(strNum.charAt(i) == '6'){
                strNum.setCharAt(i, '9');
                break;
            }
        }
        return Integer.parseInt(strNum.toString());
    }
}