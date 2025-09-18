package rw.loda.meis.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;



import rw.loda.meis.dao.MeisDashboardDAO;
import rw.loda.meis.vo.DASHMyPageVO;

@Service("meisDashboardService")
public class MeisDashboardServiceImpl implements MeisDashboardService {
	
	@Resource(name = "meisDashboardDao")
	private MeisDashboardDAO meisDashboardDao;

	
	
	public int getCntAllSectorCovered() {
		int cntAllSectors = meisDashboardDao.getCntAllSectorCovered();
		return cntAllSectors;
	}

	public int getCntAllWDays() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntAllWDays();
	}

	public int getCntMaleAllWDays() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntMaleAllWDays();
	}

	public int getCntFemaleAllWDays() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntFemaleAllWDays();
	}

	public int getCntHHEmployed() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntHHEmployed();
	}

	public int getCntMaleHHEmployed() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntMaleHHEmployed();
	}

	public int getCntFemaleHHEmployed() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntFemaleHHEmployed();
	}

	public List<DASHMyPageVO> getRecipientsPerDistricts(DASHMyPageVO DASHMyPageVO) {
		// TODO Auto-generated method stub
		List<DASHMyPageVO> districts = meisDashboardDao.getRecipientsPerDistricts(DASHMyPageVO);

		return districts;
	}

	public DASHMyPageVO getRecipientsPerProjectsTransport() {
		DASHMyPageVO projects = meisDashboardDao.getRecipientsPerProjectsTransport();
		return projects;
	}

	public DASHMyPageVO getRecipientsPerProjectsTerrace() {
		DASHMyPageVO terrace = meisDashboardDao.getRecipientsPerProjectsTerrace();
		return terrace;
	}

	public int getCntAllSectorCoveredByePw() {
		  int cntAllSectorCoveredByePw = meisDashboardDao.getCntAllSectorCoveredByePw();
		return cntAllSectorCoveredByePw;
	}

	public int getCntAllWDaysEPw() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntAllWDaysEPw();
	}

	public int getCntMaleAllWDaysEPw() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntMaleAllWDaysEPw();
	}

	public int getCntFemaleAllWDaysEPw() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntFemaleAllWDaysEPw();
	}

	public int getCntHHEmployedEPw() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntHHEmployedEPw();
	}

	public int getCntMaleHHEmployedEPW() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntMaleHHEmployedEPw();
	}

	public int getCntFemaleHHEmployedEPw() {
		// TODO Auto-generated method stub
		return meisDashboardDao.getCntFemaleHHEmployedEPw();
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPW(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		List<DASHMyPageVO> districts = meisDashboardDao.getRecipientsPerDistrictsEPW(pageVO);
		return districts;
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPwLB() {
		// TODO Auto-generated method stub
		List<DASHMyPageVO> districts = meisDashboardDao.getRecipientsPerDistrictsEPwLB();
		return districts;
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsEPwECD(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		List<DASHMyPageVO> districts = meisDashboardDao.getRecipientsPerDistrictsEPwECD(pageVO);
		return districts;
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsDS(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		List<DASHMyPageVO> districts = meisDashboardDao.getRecipientsPerDistrictsDS(pageVO);
		return districts;
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsDsWithDisability(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		
		return meisDashboardDao.getRecipientsPerDistrictsDsWithDisability(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsWithDisabilityUnderAge(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRcpntsPerDstrctsWithDisabilityUnderAge(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsOAG(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRcpntsPerDstrctsOAG(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsSkills(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRcpntsPerDstrctsSkills(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsAsset(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRcpntsPerDstrctsAsset(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsLiveStock(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return  meisDashboardDao.getRcpntsPerDstrctsLiveStock(pageVO);
	}

	public List<DASHMyPageVO> getRcpntsPerDstrctsStartup(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRcpntsPerDstrctsStartup(pageVO);
	}

	public List<DASHMyPageVO> getRecipientsPerDistrictsShock(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRecipientsPerDistrictsShock(pageVO);
	}

	public DASHMyPageVO getRecipientsPerDistrictsPerfIndicator(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRecipientsPerDistrictsPerfIndicator(pageVO);
	}

	public DASHMyPageVO getRecipientsPerDistrictsPerfIndicatorShock(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRecipientsPerDistrictsPerfIndicatorShock(pageVO);
	}

	public DASHMyPageVO getAllKeyIndicatorsDS(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getAllKeyIndicatorsDS(pageVO);
	}

	public DASHMyPageVO getAllKeyIndicatorsCPW(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		//System.out.println("getFiscYr88888"+DASHMyPageVO.getFiscYr());
		return meisDashboardDao.getAllKeyIndicatorsCPW(pageVO);
	}

	public DASHMyPageVO getAllKeyIndicatorsEPW(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getAllKeyIndicatorsEPW(pageVO);
	}

	public DASHMyPageVO getRecipientsPWPerProjectType(DASHMyPageVO pageVO) {
		// TODO Auto-generated method stub
		return meisDashboardDao.getRecipientsPWPerProjectType(pageVO);
	}
	
}
