
public class PhoneRepair implements IPhoneRepair,IAccessoryRepair{

	@Override
	public void ProcessAccessoryRepair(String accessoryType)
	{
		System.out.println(String.format("%s repair accepted!", accessoryType));
		
	}
	@Override
	public void ProcessPhoneRepair(String modelName) {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s repair accepted!", modelName));
	}
}
