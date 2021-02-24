class Solution {
    public boolean isPalindrome(int x) {
       //Stack<Integer> res=new Stack<Integer>();
        if(x<0 ||(x%10==0 && x!=0))
            return false;
        int res=0;
        int ori=x;
        while(x!=0){
            int temp=x%10;
            res=res*10+temp;
            x/=10;
        }
        System.out.println(res);
        if(ori!=res){
            return false;
        }else{
            return true;
        }
        
        
    }
}
