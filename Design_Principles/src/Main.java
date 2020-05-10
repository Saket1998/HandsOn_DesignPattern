import java.util.*;
public class Main {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our site. Would you like to order or repair?");
		String processOption=sc.nextLine().toLowerCase().trim();
		PhoneOrder po = new PhoneOrder();
		PhoneRepair pr = new PhoneRepair();
		ProcessPhoneRepair ppr = new ProcessPhoneRepair();
		String productDetail="";
		switch(processOption)
		{
			case "order":
				System.out.println("Please provide the phone model name");
				productDetail=sc.nextLine().trim();
				po.ProcessOrder(productDetail);
				break;
			case "repair":
				System.out.println("Is it the phone or the accessory that you want to be repaired?");
				String productType=sc.nextLine().toLowerCase();
				if(productType.equals("phone"))
				{
					System.out.println("Please provide the phone model name");
					productDetail=sc.nextLine().trim();
					pr.ProcessPhoneRepair(productDetail);
					if(productDetail.equalsIgnoreCase("samsungnote")) {
						SamsungNote samsungNote = new SamsungNote();
						ppr.RepairSteps(samsungNote);
					}
					else {
						Redmi7 redmi7 = new Redmi7();
						ppr.RepairSteps(redmi7);
					}
				}
				else
				{
					System.out.println("Please provide the accessory detail, like headphone, tempered glass");
					productDetail=sc.nextLine().trim();
					pr.ProcessAccessoryRepair(productDetail);
				}
				break;
			default:
				break;
		}
	}

}
