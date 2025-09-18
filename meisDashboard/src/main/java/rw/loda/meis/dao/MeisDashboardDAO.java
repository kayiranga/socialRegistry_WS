package rw.loda.meis.dao;

import java.util.List;

import org.springframework.stereotype.Repository;



import rw.loda.meis.vo.DASHMyPageVO;

@Repository("meisDashboardDao")
public interface MeisDashboardDAO {

	
	
	public int getCntAllSectorCovered();

	public int getCntAllWDays();

	public int getCntMaleAllWDays();

	public int getCntFemaleAllWDays();

	public int getCntHHEmployed();

	public int getCntMaleHHEmployed();

	public int getCntFemaleHHEmployed();

	public List<DASHMyPageVO> getRecipientsPerDistricts(DASHMyPageVO pageVO);

	public DASHMyPageVO getRecipientsPerProjectsTransport();

	public DASHMyPageVO getRecipientsPerProjectsTerrace();

	public int getCntAllSectorCoveredByePw();

	public int getCntAllWDaysEPw();

	public int getCntMaleAllWDaysEPw();

	public int getCntFemaleAllWDaysEPw();

	public int getCntHHEmployedEPw();

	public int getCntMaleHHEmployedEPw();

	public int getCntFemaleHHEmployedEPw();

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPW(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPwLB();

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPwECD(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRecipientsPerDistrictsDS(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRecipientsPerDistrictsDsWithDisability(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsWithDisabilityUnderAge(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsOAG(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsSkills(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsAsset(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsLiveStock(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRcpntsPerDstrctsStartup(DASHMyPageVO pageVO);

	public List<DASHMyPageVO> getRecipientsPerDistrictsShock(DASHMyPageVO pageVO);

	public DASHMyPageVO getRecipientsPerDistrictsPerfIndicator(DASHMyPageVO pageVO);

	public DASHMyPageVO getRecipientsPerDistrictsPerfIndicatorShock(DASHMyPageVO pageVO);

	public DASHMyPageVO getAllKeyIndicatorsDS(DASHMyPageVO pageVO);

	public DASHMyPageVO getAllKeyIndicatorsCPW(DASHMyPageVO pageVO);

	public DASHMyPageVO getAllKeyIndicatorsEPW(DASHMyPageVO pageVO);

	public DASHMyPageVO getRecipientsPWPerProjectType(DASHMyPageVO pageVO);


}
