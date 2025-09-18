package rw.loda.meis.service;

import java.util.List;



import rw.loda.meis.vo.DASHMyPageVO;

public interface MeisDashboardService {

	
	
	public int getCntAllSectorCovered();
	public int getCntAllWDays();
	int getCntMaleAllWDays();
	int getCntFemaleAllWDays();
	int getCntHHEmployed();
	int getCntMaleHHEmployed();
	int getCntFemaleHHEmployed();
	List<DASHMyPageVO> getRecipientsPerDistricts(DASHMyPageVO pageVO);
	DASHMyPageVO getRecipientsPerProjectsTransport();
	DASHMyPageVO getRecipientsPerProjectsTerrace();
	int getCntAllSectorCoveredByePw();
	int getCntAllWDaysEPw();
	int getCntMaleAllWDaysEPw();
	int getCntFemaleAllWDaysEPw();
	int getCntHHEmployedEPw();
	int getCntMaleHHEmployedEPW();
	int getCntFemaleHHEmployedEPw();
	List<DASHMyPageVO> getRecipientsPerDistrictsEPW(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRecipientsPerDistrictsEPwLB();
	List<DASHMyPageVO> getRecipientsPerDistrictsEPwECD(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRecipientsPerDistrictsDS(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRecipientsPerDistrictsDsWithDisability(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsWithDisabilityUnderAge(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsOAG(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsSkills(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsAsset(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsLiveStock(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRcpntsPerDstrctsStartup(DASHMyPageVO pageVO);
	List<DASHMyPageVO> getRecipientsPerDistrictsShock(DASHMyPageVO pageVO);
	DASHMyPageVO getRecipientsPerDistrictsPerfIndicator(DASHMyPageVO pageVO);
	DASHMyPageVO getRecipientsPerDistrictsPerfIndicatorShock(DASHMyPageVO pageVO);
	DASHMyPageVO getAllKeyIndicatorsDS(DASHMyPageVO pageVO);
	DASHMyPageVO getAllKeyIndicatorsCPW(DASHMyPageVO pageVO);
	DASHMyPageVO getAllKeyIndicatorsEPW(DASHMyPageVO pageVO);
	DASHMyPageVO getRecipientsPWPerProjectType(DASHMyPageVO pageVO);
}
