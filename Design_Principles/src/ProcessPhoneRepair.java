
public class ProcessPhoneRepair {
	public void RepairSteps(IPhone phone) {
		String part1=phone.GetPhonePart1();
		System.out.println(String.format("%s repaired", part1));
		double partCost=phone.GetPart1Cost();
		System.out.println(String.format("Repair Cost %g", partCost*0.5));
	}
}
