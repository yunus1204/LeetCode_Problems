class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n=prices.length;
        if(n<=1) return money;
        int amt=money-(prices[0]+prices[1]);
        if(amt>=0) return amt;
        else return money;
    }
}
