package inheritance;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	void turnOnDmb() {
		System.out.println("ä��" + channel+" �� DMB ��� ����");
	}
	void turnOffDmb() {
		System.out.println("ä��" + channel+" �� DMB ��� ����");
	}
	void changeChannelDmb() {
		System.out.println("ä��" + channel+" �� ����");
	}
	
	
}
