import java.util.Arrays;

public class CoinChange {

    private int coinChangeReturn(int[] coins, int amount) {
    	if(coins==null || coins.length==0) return 0;
        if(coins.length==1 && coins[0]==amount) return 1;
        
        int[] arr= new int[amount+1];
		Arrays.fill(arr, amount+1);
		arr[0]=0;
		for(int coin : coins){
			for(int a=coin;a<=amount;a++){
				arr[a]=Math.min(arr[a], arr[a-coin]+1);
			}
		}
		return arr[arr.length-1]>amount?-1:arr[arr.length-1];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] coins = {1, 2, 5};
		int amt = 11;
		
		CoinChange cc = new CoinChange();
		System.out.println(cc.coinChangeReturn(coins, amt));
	}

}
