package rw.loda.meis.web;



import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rw.loda.meis.service.MeisDashboardService;
import rw.loda.meis.vo.DASHMyPageVO;



@Controller("meisDashbordController")
public class MeisDashbordController {

	// @Autowired
	@Resource(name = "meisDashboardService")
	private MeisDashboardService meisDashboardService;

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(@ModelAttribute("pageVO") DASHMyPageVO pageVO, Model model) {
		
		System.out.println("getFiscYr-->  "+pageVO.getFiscYr());
		System.out.println("getDistrictNo--->"+pageVO.getDistrictNo());
		
		//if (pageVO.getDistrictNo() == null || pageVO.getDistrictNo() == 0) {
		if (pageVO.getDistrictNo() == null) {
			pageVO.setDistrictNo(1);
			pageVO.setFiscYr(18);
		}
		model.addAttribute("DASHMyPageVO", pageVO); // make sure it’s in the model
		
		//CPW
		DASHMyPageVO indicatorsCPW = meisDashboardService.getAllKeyIndicatorsCPW(pageVO);
//		int cntAllSectors = meisDashboardService.getCntAllSectorCovered();
//		int cntAllWDays = meisDashboardService.getCntAllWDays();
//		int cntMaleAllWDays = meisDashboardService.getCntMaleAllWDays();
//		int cntFemaleAllWDays = meisDashboardService.getCntFemaleAllWDays();
//		int cntHHEmployed = meisDashboardService.getCntHHEmployed();
//		int cntMaleHHEmployed = meisDashboardService.getCntMaleHHEmployed();
//		int cntFemaleHHEmployed = meisDashboardService.getCntFemaleHHEmployed(); 
		
		
		List<DASHMyPageVO> listOfDistricts = meisDashboardService.getRecipientsPerDistricts(pageVO);	
		DASHMyPageVO listOfPWProjType = meisDashboardService.getRecipientsPWPerProjectType(pageVO);
//		DASHMyPageVO listOfProjTrans = meisDashboardService.getRecipientsPerProjectsTransport();
//		DASHMyPageVO terraceInfo = meisDashboardService.getRecipientsPerProjectsTerrace();
		
		//EPW
		DASHMyPageVO indicatorsEPW = meisDashboardService.getAllKeyIndicatorsEPW(pageVO);
		
//		int cntAllSectorsEPW = meisDashboardService.getCntAllSectorCoveredByePw();
//		int cntAllWDaysEPW = meisDashboardService.getCntAllWDaysEPw();
//		int cntMaleAllWDaysEPW = meisDashboardService.getCntMaleAllWDaysEPw();
//		int cntFemaleAllWDaysEPW = meisDashboardService.getCntFemaleAllWDaysEPw();
//		int cntHHEmployedEPW = meisDashboardService.getCntHHEmployedEPw();
//		int cntMaleHHEmployedEPW = meisDashboardService.getCntMaleHHEmployedEPW();
//		int cntFemaleHHEmployedEPW = meisDashboardService.getCntFemaleHHEmployedEPw();
		
		List<DASHMyPageVO> listOfDistrictsEPW = meisDashboardService.getRecipientsPerDistrictsEPW(pageVO);
//		List<DASHMyPageVO> listOfDistrictsEPwLB = meisDashboardService.getRecipientsPerDistrictsEPwLB();
		List<DASHMyPageVO> listOfDistrictsEPwECD = meisDashboardService.getRecipientsPerDistrictsEPwECD(pageVO);
		
		
		 //DS
		DASHMyPageVO indicatorsDS = meisDashboardService.getAllKeyIndicatorsDS(pageVO);
		
		List<DASHMyPageVO> listOfDistrictsDS=meisDashboardService.getRecipientsPerDistrictsDS(pageVO);
		List<DASHMyPageVO> listOfDistrictsDSWithDisability = meisDashboardService.getRecipientsPerDistrictsDsWithDisability(pageVO);
		List<DASHMyPageVO> listOfDistrictsDisabilityUnderAge = meisDashboardService.getRcpntsPerDstrctsWithDisabilityUnderAge(pageVO);
		
		//AOG
		List<DASHMyPageVO> listOfDistrictsAOG = meisDashboardService.getRcpntsPerDstrctsOAG(pageVO);
		
		//SKILLS
		List<DASHMyPageVO> listOfDistrictsSkills = meisDashboardService.getRcpntsPerDstrctsSkills(pageVO);
		
		//ASSET
		List<DASHMyPageVO> listOfDistrictsAsset = meisDashboardService.getRcpntsPerDstrctsAsset(pageVO);
		
		//livestock
		
		List<DASHMyPageVO> listOfDistrictsLivestock  = meisDashboardService.getRcpntsPerDstrctsLiveStock(pageVO);
		
		//startup tools
		List<DASHMyPageVO> listOfDistrictsStartup  = meisDashboardService.getRcpntsPerDstrctsStartup(pageVO);
		
		//SHOCK RESPONSIVE
		List<DASHMyPageVO> listOfDistrictsShock  = meisDashboardService.getRecipientsPerDistrictsShock(pageVO);
		
		//SHOCK RESP -INDICATOR
		
		DASHMyPageVO srIndicator = meisDashboardService.getRecipientsPerDistrictsPerfIndicator(pageVO);
		
		//SHOCK RESP - TYPE OF SHOCK
		DASHMyPageVO srIndicatorTypeofShock = meisDashboardService.getRecipientsPerDistrictsPerfIndicatorShock(pageVO);
		
		
		/*rendering on pages*/
		//CPW
		
		model.addAttribute("indicatorsCPW",indicatorsCPW);
		
//		model.addAttribute("cntAllSectors",cntAllSectors);
//		model.addAttribute("cntAllWDays",cntAllWDays);
//		model.addAttribute("cntMaleAllWDays",cntMaleAllWDays);
//		model.addAttribute("cntFemaleAllWDays",cntFemaleAllWDays);
//		model.addAttribute("cntHHEmployed",cntHHEmployed);
//		model.addAttribute("cntMaleHHEmployed",cntMaleHHEmployed);
//		model.addAttribute("cntFemaleHHEmployed",cntFemaleHHEmployed);	
		
		model.addAttribute("listOfDistricts",listOfDistricts);
		model.addAttribute("listOfPWProjType",listOfPWProjType);
		
		//model.addAttribute("listOfProjTrans",listOfProjTrans);
		//model.addAttribute("terrace",terraceInfo);
		
		//EPW(extended public works)
		
		model.addAttribute("indicatorsEPW",indicatorsEPW);
		
//		model.addAttribute("cntAllSectorsEPW",cntAllSectorsEPW);
//		model.addAttribute("cntAllWDaysEPW",cntAllWDaysEPW);
//		model.addAttribute("cntMaleAllWDaysEPW",cntMaleAllWDaysEPW);
//		model.addAttribute("cntFemaleAllWDaysEPW",cntFemaleAllWDaysEPW);
//		model.addAttribute("cntHHEmployedEPW",cntHHEmployedEPW);
//		model.addAttribute("cntMaleHHEmployedEPW",cntMaleHHEmployedEPW);
//		model.addAttribute("cntFemaleHHEmployedEPW",cntFemaleHHEmployedEPW);
		
		model.addAttribute("listOfDistrictsEPW",listOfDistrictsEPW);
//		//model.addAttribute("listOfDistrictsEPwLB",listOfDistrictsEPwLB);
		model.addAttribute("listOfDistrictsEPwECD",listOfDistrictsEPwECD);
		
		//DS(direct support)
		
		model.addAttribute("indicatorsDS",indicatorsDS);
		model.addAttribute("listOfDistrictsDS",listOfDistrictsDS);
		model.addAttribute("listOfDistrictsDisability",listOfDistrictsDSWithDisability);
		model.addAttribute("listOfDistrictsDisabilityUnderAge", listOfDistrictsDisabilityUnderAge);
		
		//AOG
		model.addAttribute("listOfDistrictsAOG", listOfDistrictsAOG);
		
		//SKILLS 
		model.addAttribute("listOfDistrictsSkills", listOfDistrictsSkills);
		
		//ASSET
		model.addAttribute("listOfDistrictsAsset", listOfDistrictsAsset);
		
		//LIVESTOCK
		model.addAttribute("listOfDistrictsLivestock", listOfDistrictsLivestock);
		
		//STARTUP TOOLS
		model.addAttribute("listOfDistrictsStartup", listOfDistrictsStartup);
		
		//SHOCK
		model.addAttribute("listOfDistrictsShock", listOfDistrictsShock);
		
		//SHOCK INDICATOR
		model.addAttribute("srIndicator", srIndicator);
		
		//SHOCK RESP - TYPE OF SHOCK
		model.addAttribute("srIndicatorTypeofShock", srIndicatorTypeofShock);
				 
		
		
		return "signup";
	}
	

}
