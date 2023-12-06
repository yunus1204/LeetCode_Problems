class Solution {
    public int totalMoney(int n) {
        int tot_cost=0;
        int daily_money=0;
        int week_track=0;
        int temp=1;
        for(int i=1;i<=n;i++)
        {
            week_track++;
            if(week_track>7)
            {
                daily_money=temp;
                temp++;
                week_track=1;
            }
            tot_cost+=daily_money++;

        }
        return tot_cost+n;
    }
}
