import java.awt.List;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

//TODO: allow people to verify NY Lottery number calculation easily
//TODO: force locale to avoid decimals, commas issue
//TODO: encrypt wallet
//TODO: make it so when you make a transaction, it automatically shows the pending transaction
//TODO: make it so pending transactions affect the balance so people can't double bet, double btcpay, etc.
//TODO: make transactions keep retrying
//TODO: more information on fees
//TODO: chancecoin wallet should list all types of transactions maybe?
//TODO: option to allow btcpays to be completed automatically?
//TODO: automatically buy CHA at best price and bet (basically bet with BTC, it buys the CHA on the Dex, and we are always offering)
//TODO: test betting with 0 bet size
//TODO: other games
//TODO: redundancy for downloads.txt on github
//TODO: use NAS's blockchain download stuff if it's better than bitcoinj
//TODO: other ways to transactions/bet resolving faster?
//TODO: scratch ticket solution: lock in randomness and bet offline
//TODO: use n-of-3 multisig as per dexx7's suggestions
//TODO: make chancecoin.com live
public class Test {

	public static void main(String[] args) {
//		Database db = Database.getInstance();
//		ResultSet rs = db.executeQuery("select block_hash from blocks;");
//		try {
//			while (rs.next()) {
//				Double rollA = (new BigInteger(rs.getString("block_hash"),16)).mod(BigInteger.valueOf(1000000000)).doubleValue()/1000000000.0;
//				System.out.println(rollA);			
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Blocks blocks = Blocks.getInstanceAndWait();
//		for (Integer block : Arrays.asList(308218,308023,308002,308318)) {
//			blocks.reDownloadBlockTransactions(block);
//			blocks.parseBlock(block);
//		}
	}
	
}
