
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*�f�[�^����*/
		//�}�b�v�f�[�^
		Map mapData =  new  Map();
		
		
		//�}�b�v�f�[�^���[�h
		mapData.loadMap();
		
		
		
		//�E�C���h�E�̍쐬
		Monitor monitor = new Monitor();
		//�}�b�v�f�[�^�̕`��
		monitor.showInitMap(mapData);
		
		//�S�[���|�C���g�̎w��:���񂷂�T�[�N��
		MapPoint [] mpGoal = new MapPoint[3];
		monitor.selectGoal(mpGoal);
		
		Findpath findpath = new Findpath(mapData,mpGoal);
		
		
		
		
	}

}
