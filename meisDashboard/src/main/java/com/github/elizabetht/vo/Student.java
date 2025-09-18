package com.github.elizabetht.vo;

import java.util.Date;
import java.util.List;

public class Student {
	private Long id;

	private String userName;

	private String firstName;

	private String lastName;

	private String password;

	private String emailAddress;

	private Date dateOfBirth;
	private List<Student> studentList;
	
	//new fields
	private String maleCount;
	private String femaleCount;
	private String districtName;
	private String totalCount;
	private String totalPaidByMale;
	private String totalPaidByFemale;
	private String totalPaidByAll;
	private String numberOfSectorsCovered;
	private String numberOfEligibleHousehold;
	
	private String HHLivestock;
	private String HHStartup;
	private String totalQuantity;
	private String quantityLivestock;
	private String quantityStartup;
	

	private String totalCost;
	private String nbrGoats;
	private String nbrSheeps;
	private String nbrPigs;
	private String nbrChickens;
	private String nbrRabbits;
	
	
	private String nbrBuildingMasonry;
	private String nbrCarpentry;
	private String nbrElectricity;
	private String nbrHairdressing;
	private String nbrMechanics;
	private String nbrSewing;
	private String nbrShoesmaking;
	private String nbrWelding;
	
	
	private String maleCountMU;
	private String femaleCountMU;
	private String totalPaidMU;
	
	private String maleCountVU;
	private String femaleCountVU;
	private String totalPaidVU;
	
	private String maleCountNU;
	private String femaleCountNU;
	private String totalPaidNU;
	
	private String maleCountDHHBW;
	private String femaleCountDHHBW;
	private String totalPaidDHHBW;
	
	private String maleCountSIHHBW;
	private String femaleCountSIHHBW;
	private String totalPaidSIHHBW;

	private String maleCountPLS;
	private String femaleCountPLS;
	private String totalPaidPLS;


	private String maleCountCLS;
	private String femaleCountCLS;
	private String totalPaidCLS;

	private String maleCountLDA;
	private String femaleCountLDA;
	private String totalPaidLDA;

	private String maleCountLC;
	private String femaleCountLC;
	private String totalPaidLC;
	
	private String allWDays;
	private String maleAllWDays;
	private String femaleAllWDays;
	
	private String chbecd;
	
	private String femaleHHCount;
	private String maleHHCount;
	
	private String disabilityCount;
	private String totalBudgetDisability;
	
	private String totalChildren;
	private String  totalBoysChildren;
	private String totalGirlsChildren;
	
	private String maleCountPT;
	private String femaleCountPT;
	private String totalCountPT;
	
	private String maleCountRT;
	private String femaleCountRT;
	private String totalCountRT;
	
	private String maleCountRR;
	private String femaleCountRR;
	private String totalCountRR;
	
	private String maleCountRG;
	private String femaleCountRG;
	private String totalCountRG;
	
    private Integer fiscYr;
    private Integer districtNo;
	
	
	
	
	public Integer getDistrictNo() {
		return districtNo;
	}

	public void setDistrictNo(Integer districtNo) {
		this.districtNo = districtNo;
	}

	public Integer getFiscYr() {
		return fiscYr;
	}

	public void setFiscYr(Integer fiscYr) {
		this.fiscYr = fiscYr;
	}

	public String getMaleCountPT() {
		return maleCountPT;
	}

	public void setMaleCountPT(String maleCountPT) {
		this.maleCountPT = maleCountPT;
	}

	public String getFemaleCountPT() {
		return femaleCountPT;
	}

	public void setFemaleCountPT(String femaleCountPT) {
		this.femaleCountPT = femaleCountPT;
	}

	public String getTotalCountPT() {
		return totalCountPT;
	}

	public void setTotalCountPT(String totalCountPT) {
		this.totalCountPT = totalCountPT;
	}

	public String getMaleCountRT() {
		return maleCountRT;
	}

	public void setMaleCountRT(String maleCountRT) {
		this.maleCountRT = maleCountRT;
	}

	public String getFemaleCountRT() {
		return femaleCountRT;
	}

	public void setFemaleCountRT(String femaleCountRT) {
		this.femaleCountRT = femaleCountRT;
	}

	public String getTotalCountRT() {
		return totalCountRT;
	}

	public void setTotalCountRT(String totalCountRT) {
		this.totalCountRT = totalCountRT;
	}

	public String getMaleCountRR() {
		return maleCountRR;
	}

	public void setMaleCountRR(String maleCountRR) {
		this.maleCountRR = maleCountRR;
	}

	public String getFemaleCountRR() {
		return femaleCountRR;
	}

	public void setFemaleCountRR(String femaleCountRR) {
		this.femaleCountRR = femaleCountRR;
	}

	public String getTotalCountRR() {
		return totalCountRR;
	}

	public void setTotalCountRR(String totalCountRR) {
		this.totalCountRR = totalCountRR;
	}

	public String getMaleCountRG() {
		return maleCountRG;
	}

	public void setMaleCountRG(String maleCountRG) {
		this.maleCountRG = maleCountRG;
	}

	public String getFemaleCountRG() {
		return femaleCountRG;
	}

	public void setFemaleCountRG(String femaleCountRG) {
		this.femaleCountRG = femaleCountRG;
	}

	public String getTotalCountRG() {
		return totalCountRG;
	}

	public void setTotalCountRG(String totalCountRG) {
		this.totalCountRG = totalCountRG;
	}

	public String getTotalBoysChildren() {
		return totalBoysChildren;
	}

	public void setTotalBoysChildren(String totalBoysChildren) {
		this.totalBoysChildren = totalBoysChildren;
	}

	public String getTotalGirlsChildren() {
		return totalGirlsChildren;
	}

	public void setTotalGirlsChildren(String totalGirlsChildren) {
		this.totalGirlsChildren = totalGirlsChildren;
	}

	public String getTotalChildren() {
		return totalChildren;
	}

	public void setTotalChildren(String totalChildren) {
		this.totalChildren = totalChildren;
	}

	public String getTotalBudgetDisability() {
		return totalBudgetDisability;
	}

	public void setTotalBudgetDisability(String totalBudgetDisability) {
		this.totalBudgetDisability = totalBudgetDisability;
	}

	public String getDisabilityCount() {
		return disabilityCount;
	}

	public void setDisabilityCount(String disabilityCount) {
		this.disabilityCount = disabilityCount;
	}

	public String getFemaleHHCount() {
		return femaleHHCount;
	}

	public void setFemaleHHCount(String femaleHHCount) {
		this.femaleHHCount = femaleHHCount;
	}

	public String getMaleHHCount() {
		return maleHHCount;
	}

	public void setMaleHHCount(String maleHHCount) {
		this.maleHHCount = maleHHCount;
	}

	public String getChbecd() {
		return chbecd;
	}

	public void setChbecd(String chbecd) {
		this.chbecd = chbecd;
	}

	public String getAllWDays() {
		return allWDays;
	}

	public void setAllWDays(String allWDays) {
		this.allWDays = allWDays;
	}

	public String getMaleAllWDays() {
		return maleAllWDays;
	}

	public void setMaleAllWDays(String maleAllWDays) {
		this.maleAllWDays = maleAllWDays;
	}

	public String getFemaleAllWDays() {
		return femaleAllWDays;
	}

	public void setFemaleAllWDays(String femaleAllWDays) {
		this.femaleAllWDays = femaleAllWDays;
	}

	public String getMaleCountDHHBW() {
		return maleCountDHHBW;
	}

	public void setMaleCountDHHBW(String maleCountDHHBW) {
		this.maleCountDHHBW = maleCountDHHBW;
	}

	public String getFemaleCountDHHBW() {
		return femaleCountDHHBW;
	}

	public void setFemaleCountDHHBW(String femaleCountDHHBW) {
		this.femaleCountDHHBW = femaleCountDHHBW;
	}

	public String getTotalPaidDHHBW() {
		return totalPaidDHHBW;
	}

	public void setTotalPaidDHHBW(String totalPaidDHHBW) {
		this.totalPaidDHHBW = totalPaidDHHBW;
	}

	public String getMaleCountSIHHBW() {
		return maleCountSIHHBW;
	}

	public void setMaleCountSIHHBW(String maleCountSIHHBW) {
		this.maleCountSIHHBW = maleCountSIHHBW;
	}

	public String getFemaleCountSIHHBW() {
		return femaleCountSIHHBW;
	}

	public void setFemaleCountSIHHBW(String femaleCountSIHHBW) {
		this.femaleCountSIHHBW = femaleCountSIHHBW;
	}

	public String getTotalPaidSIHHBW() {
		return totalPaidSIHHBW;
	}

	public void setTotalPaidSIHHBW(String totalPaidSIHHBW) {
		this.totalPaidSIHHBW = totalPaidSIHHBW;
	}

	public String getMaleCountPLS() {
		return maleCountPLS;
	}

	public void setMaleCountPLS(String maleCountPLS) {
		this.maleCountPLS = maleCountPLS;
	}

	public String getFemaleCountPLS() {
		return femaleCountPLS;
	}

	public void setFemaleCountPLS(String femaleCountPLS) {
		this.femaleCountPLS = femaleCountPLS;
	}

	public String getTotalPaidPLS() {
		return totalPaidPLS;
	}

	public void setTotalPaidPLS(String totalPaidPLS) {
		this.totalPaidPLS = totalPaidPLS;
	}

	public String getMaleCountCLS() {
		return maleCountCLS;
	}

	public void setMaleCountCLS(String maleCountCLS) {
		this.maleCountCLS = maleCountCLS;
	}

	public String getFemaleCountCLS() {
		return femaleCountCLS;
	}

	public void setFemaleCountCLS(String femaleCountCLS) {
		this.femaleCountCLS = femaleCountCLS;
	}

	public String getTotalPaidCLS() {
		return totalPaidCLS;
	}

	public void setTotalPaidCLS(String totalPaidCLS) {
		this.totalPaidCLS = totalPaidCLS;
	}

	public String getMaleCountLDA() {
		return maleCountLDA;
	}

	public void setMaleCountLDA(String maleCountLDA) {
		this.maleCountLDA = maleCountLDA;
	}

	public String getFemaleCountLDA() {
		return femaleCountLDA;
	}

	public void setFemaleCountLDA(String femaleCountLDA) {
		this.femaleCountLDA = femaleCountLDA;
	}

	public String getTotalPaidLDA() {
		return totalPaidLDA;
	}

	public void setTotalPaidLDA(String totalPaidLDA) {
		this.totalPaidLDA = totalPaidLDA;
	}

	public String getMaleCountLC() {
		return maleCountLC;
	}

	public void setMaleCountLC(String maleCountLC) {
		this.maleCountLC = maleCountLC;
	}

	public String getFemaleCountLC() {
		return femaleCountLC;
	}

	public void setFemaleCountLC(String femaleCountLC) {
		this.femaleCountLC = femaleCountLC;
	}

	public String getTotalPaidLC() {
		return totalPaidLC;
	}

	public void setTotalPaidLC(String totalPaidLC) {
		this.totalPaidLC = totalPaidLC;
	}

	public String getMaleCountMU() {
		return maleCountMU;
	}

	public void setMaleCountMU(String maleCountMU) {
		this.maleCountMU = maleCountMU;
	}

	public String getFemaleCountMU() {
		return femaleCountMU;
	}

	public void setFemaleCountMU(String femaleCountMU) {
		this.femaleCountMU = femaleCountMU;
	}

	public String getTotalPaidMU() {
		return totalPaidMU;
	}

	public void setTotalPaidMU(String totalPaidMU) {
		this.totalPaidMU = totalPaidMU;
	}

	public String getMaleCountVU() {
		return maleCountVU;
	}

	public void setMaleCountVU(String maleCountVU) {
		this.maleCountVU = maleCountVU;
	}

	public String getFemaleCountVU() {
		return femaleCountVU;
	}

	public void setFemaleCountVU(String femaleCountVU) {
		this.femaleCountVU = femaleCountVU;
	}

	public String getTotalPaidVU() {
		return totalPaidVU;
	}

	public void setTotalPaidVU(String totalPaidVU) {
		this.totalPaidVU = totalPaidVU;
	}

	public String getMaleCountNU() {
		return maleCountNU;
	}

	public void setMaleCountNU(String maleCountNU) {
		this.maleCountNU = maleCountNU;
	}

	public String getFemaleCountNU() {
		return femaleCountNU;
	}

	public void setFemaleCountNU(String femaleCountNU) {
		this.femaleCountNU = femaleCountNU;
	}

	public String getTotalPaidNU() {
		return totalPaidNU;
	}

	public void setTotalPaidNU(String totalPaidNU) {
		this.totalPaidNU = totalPaidNU;
	}

	public String getNbrBuildingMasonry() {
		return nbrBuildingMasonry;
	}

	public void setNbrBuildingMasonry(String nbrBuildingMasonry) {
		this.nbrBuildingMasonry = nbrBuildingMasonry;
	}

	public String getNbrCarpentry() {
		return nbrCarpentry;
	}

	public void setNbrCarpentry(String nbrCarpentry) {
		this.nbrCarpentry = nbrCarpentry;
	}

	public String getNbrElectricity() {
		return nbrElectricity;
	}

	public void setNbrElectricity(String nbrElectricity) {
		this.nbrElectricity = nbrElectricity;
	}

	public String getNbrHairdressing() {
		return nbrHairdressing;
	}

	public void setNbrHairdressing(String nbrHairdressing) {
		this.nbrHairdressing = nbrHairdressing;
	}

	public String getNbrMechanics() {
		return nbrMechanics;
	}

	public void setNbrMechanics(String nbrMechanics) {
		this.nbrMechanics = nbrMechanics;
	}

	public String getNbrSewing() {
		return nbrSewing;
	}

	public void setNbrSewing(String nbrSewing) {
		this.nbrSewing = nbrSewing;
	}

	public String getNbrShoesmaking() {
		return nbrShoesmaking;
	}

	public void setNbrShoesmaking(String nbrShoesmaking) {
		this.nbrShoesmaking = nbrShoesmaking;
	}

	public String getNbrWelding() {
		return nbrWelding;
	}

	public void setNbrWelding(String nbrWelding) {
		this.nbrWelding = nbrWelding;
	}

	public String getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(String totalCost) {
		this.totalCost = totalCost;
	}

	public String getNbrGoats() {
		return nbrGoats;
	}

	public void setNbrGoats(String nbrGoats) {
		this.nbrGoats = nbrGoats;
	}

	public String getNbrSheeps() {
		return nbrSheeps;
	}

	public void setNbrSheeps(String nbrSheeps) {
		this.nbrSheeps = nbrSheeps;
	}

	public String getNbrPigs() {
		return nbrPigs;
	}

	public void setNbrPigs(String nbrPigs) {
		this.nbrPigs = nbrPigs;
	}

	public String getNbrChickens() {
		return nbrChickens;
	}

	public void setNbrChickens(String nbrChickens) {
		this.nbrChickens = nbrChickens;
	}

	public String getNbrRabbits() {
		return nbrRabbits;
	}

	public void setNbrRabbits(String nbrRabbits) {
		this.nbrRabbits = nbrRabbits;
	}

	public String getHHLivestock() {
		return HHLivestock;
	}

	public void setHHLivestock(String hHLivestock) {
		HHLivestock = hHLivestock;
	}

	public String getHHStartup() {
		return HHStartup;
	}

	public void setHHStartup(String hHStartup) {
		HHStartup = hHStartup;
	}

	public String getTotalQuantity() {
		return totalQuantity;
	}

	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}

	public String getQuantityLivestock() {
		return quantityLivestock;
	}

	public void setQuantityLivestock(String quantityLivestock) {
		this.quantityLivestock = quantityLivestock;
	}

	public String getQuantityStartup() {
		return quantityStartup;
	}

	public void setQuantityStartup(String quantityStartup) {
		this.quantityStartup = quantityStartup;
	}

	public String getNumberOfSectorsCovered() {
		return numberOfSectorsCovered;
	}

	public void setNumberOfSectorsCovered(String numberOfSectorsCovered) {
		this.numberOfSectorsCovered = numberOfSectorsCovered;
	}

	public String getNumberOfEligibleHousehold() {
		return numberOfEligibleHousehold;
	}

	public void setNumberOfEligibleHousehold(String numberOfEligibleHousehold) {
		this.numberOfEligibleHousehold = numberOfEligibleHousehold;
	}

	public String getTotalPaidByMale() {
		return totalPaidByMale;
	}

	public void setTotalPaidByMale(String totalPaidByMale) {
		this.totalPaidByMale = totalPaidByMale;
	}

	public String getTotalPaidByFemale() {
		return totalPaidByFemale;
	}

	public void setTotalPaidByFemale(String totalPaidByFemale) {
		this.totalPaidByFemale = totalPaidByFemale;
	}

	public String getTotalPaidByAll() {
		return totalPaidByAll;
	}

	public void setTotalPaidByAll(String totalPaidByAll) {
		this.totalPaidByAll = totalPaidByAll;
	}

	public String getMaleCount() {
		return maleCount;
	}

	public void setMaleCount(String maleCount) {
		this.maleCount = maleCount;
	}

	public String getFemaleCount() {
		return femaleCount;
	}

	public void setFemaleCount(String femaleCount) {
		this.femaleCount = femaleCount;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public Long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
