class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        StringBuilder op=new StringBuilder();
        String[] n1=num1.split("\\+");
        String[] n2=num2.split("\\+");
        Arrays.toString(n1);
        Arrays.toString(n2);
        int a=Integer.parseInt(n1[0]);
        int b=Integer.parseInt(n1[1].replace("i",""));
        int c=Integer.parseInt(n2[0]);
        int d=Integer.parseInt(n2[1].replace("i",""));
        int r=(a*c)-(b*d);
        int io=(a*d)+(b*c);
        op.append(r);
        op.append("+");
        op.append(io);
        op.append("i");
       
        return  op.toString();
        
    }
}
