package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StageRegistrationPom {
	public StageRegistrationPom(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath="//*[@id='COMMUNITY']")
	private WebElement community;
	
	
	public WebElement getCommunity() {
		return community;
	}
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[2]/div[2]/div/div[1]/label")
	private WebElement profilecreatedfor;
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[2]/div/div")
	private WebElement name;
	
	@FindBy(xpath="//*[@id='CBSRegistration']/fieldset[3]/div[2]/div[2]/label")
	private WebElement gender;

	@FindBy(xpath="//*[@id='CBSRegistration']/div[1]/fieldset/div[2]/div[1]/label/span")
	private WebElement malegender;
	
	
	public WebElement getMalegender() {
		return malegender;
	}

	public WebElement getProfilecreatedfor() {
		return profilecreatedfor;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getGender() {
		return gender;
	}
	

	@FindBy(xpath="//*[@id='continuebutton']")
	private WebElement continuebutton;


	public WebElement getContinuebutton() {
		return continuebutton;
	}
   
	
	@FindBy(xpath="//*[@id='dobspan']")
	private WebElement dob;


	public WebElement getDob() {
		return dob;
	}
	
	@FindBy(xpath="//*[@id='ISDCode']")
	private WebElement isdcode;


	public WebElement getIsdcode() {
		return isdcode;
	}
	
	@FindBy(xpath="//*[@id='RELIGION']")
	private WebElement religion;


	public WebElement getReligion() {
		return religion;
	}
	
	@FindBy(xpath="//*[@id='subcastesleect']")
	private WebElement subcaste;
	
	@FindBy(xpath="//*[@id='MOTHERTONGUE']")
	private WebElement mothertongue;


	public WebElement getSubcaste() {
		return subcaste;
	}

	public WebElement getMothertongue() {
		return mothertongue;
	}
	

	@FindBy(xpath="//*[@id='reg_martial_block']/div[2]/div/div[1]/label")
	private WebElement maritalstatus;

	@FindBy(xpath="//*[@id='reg_martial_block']/div[2]/div/div/div[3]/label/span")
	private WebElement maritalstatusdivorced;
	@FindBy(xpath="//*[@id='child_living_section']/fieldset/div[2]/div[1]/div[1]/label/span")
	private WebElement childlivingwith;
	@FindBy(xpath="//*[@id='no_child_section']/fieldset/div[2]/div/div[1]/label/span")
	private WebElement noofchild;
    

	public WebElement getNoofchild() {
		return noofchild;
	}

	public WebElement getChildlivingwith() {
		return childlivingwith;
	}

	public WebElement getMaritalstatusdivorced() {
		return maritalstatusdivorced;
	}

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}
	

	@FindBy(xpath="//*[@id='home-footer']/div[1]")
	private WebElement continuebutton2;


	public WebElement getContinuebutton2() {
		return continuebutton2;
	}
	@FindBy(xpath="//*[@id='RESIDINGSTATE']")
	private WebElement residingstate;
	@FindBy(xpath="//*[@id='RESIDINGCITY']")
	private WebElement residingcity;

	@FindBy(xpath="//*[@id='RESIDINGSTATETXT']")
	private WebElement residingstateothercountry;
	

	public WebElement getResidingstateothercountry() {
		return residingstateothercountry;
	}

	public WebElement getResidingstate() {
		return residingstate;
	}

	public WebElement getResidingcity() {
		return residingcity;
	}
	
	@FindBy(xpath="//*[@id='CITIZENSHIP']")
	private WebElement citizenship;
	@FindBy(xpath="//*[@id='RESIDENTSTATUS']")
	private WebElement residingstatus;
	
	
	public WebElement getCitizenship() {
		return citizenship;
	}

	public WebElement getResidingstatus() {
		return residingstatus;
	}

	@FindBy(xpath="//*[@id='HEIGHT']")
	private WebElement height;
	@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[7]/div[2]/div/div[1]/label")
	private WebElement physicalstatus;


	public WebElement getHeight() {
		return height;
	}

	public WebElement getPhysicalstatus() {
		return physicalstatus;
	}
    
	@FindBy(xpath="//*[@id='continuebutton']")
	private WebElement continuebutton3;


	public WebElement getContinuebutton3() {
		return continuebutton3;
	}
	
	 
		@FindBy(xpath="//*[@id='EDUCATION']")
		private WebElement education;
	   
		@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[6]/label/span")
		private WebElement employedin;
        
		@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[4]/div[2]/div/div/div[2]/label/span")
		private WebElement employedinworking;
		


		public WebElement getEmployedinworking() {
			return employedinworking;
		}

		public WebElement getEducation() {
			return education;
		}

		public WebElement getEmployedin() {
			return employedin;
		}
		
		@FindBy(xpath="//*[@id='OCCUPATION']")
		private WebElement occupation;


		public WebElement getOccupation() {
			return occupation;
		}
	    
		@FindBy(xpath="//*[@id='RUPEESTYPE']")
		private WebElement rs;

		@FindBy(xpath="(//*[@id='INCOMETEXT'])[1]")
		private WebElement income;


		public WebElement getRs() {
			return rs;
		}

		public WebElement getIncome() {
			return income;
		}
		
		@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[8]/div[2]/div/div[2]/label")
		private WebElement familystatus;

		@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[9]/div[2]/div/div[1]/label")
		private WebElement familytype;
    
		@FindBy(xpath="//*[@id='CBSRegistration3']/fieldset[10]/div[2]/div/div/div[3]/label/span")
		private WebElement familyvalues;


		public WebElement getFamilystatus() {
			return familystatus;
		}

		public WebElement getFamilytype() {
			return familytype;
		}

		public WebElement getFamilyvalues() {
			return familyvalues;
		}

		
		
		@FindBy(xpath="//*[@id='ethnicity_display']/fieldset/div")
		private WebElement ethinicity;
		public WebElement getEthinicity() {
			return ethinicity;
		}
		
		@FindBy(xpath="//*[@id='religious_display']/fieldset/div/div")
		private WebElement religiousvalue;
		public WebElement getReligiousvalue() {
			return religiousvalue;
		}
		
		@FindBy(xpath="//*[@id='dressofmodestry_display']/fieldset/div[2]/div/div/div[1]/label")
		private WebElement dressofmodestry;

		public WebElement getDressofmodestry() {
			return dressofmodestry;
		}


		@FindBy(xpath="//*[@id='readquran_display']/fieldset/div[2]/div/div/div[1]/label")
		private WebElement readquran;

		public WebElement getReadquran() {
			return readquran;
		}
		
		
		
		
		@FindBy(xpath="//*[@id='CBSRegistration4']/fieldset[1]/div")
		private WebElement star;
		

		@FindBy(xpath="//*[@id='RAASI']")
		private WebElement raasi;

		@FindBy(xpath="//*[@id='COUNTRYBIRTH']")
		private WebElement countryofbirth;
		

		@FindBy(xpath="//*[@id='BirthStateDisplay']/fieldset/div")
		private WebElement stateofbirth;
		
		@FindBy(xpath="(//*[@id='CitySelectBox']/fieldset/div)[1]")
		private WebElement cityofbirth;
		
		@FindBy(xpath="(//*[@id='CitySelectBox']/fieldset/div)[2]")
		private WebElement chartstyle;


		public WebElement getStar() {
			return star;
		}

		public WebElement getRaasi() {
			return raasi;
		}

		public WebElement getCountryofbirth() {
			return countryofbirth;
		}

		public WebElement getStateofbirth() {
			return stateofbirth;
		}

		public WebElement getCityofbirth() {
			return cityofbirth;
		}

		public WebElement getChartstyle() {
			return chartstyle;
		}
		
		@FindBy(xpath="//*[@id='chevaidosham_display']/fieldset/div[2]/div[2]/label/span")
		private WebElement dhosam;
		
		@FindBy(xpath="//*[@id='TIMEOFBIRTH']")
		private WebElement timeofbirth;


		public WebElement getDhosam() {
			return dhosam;
		}

		public WebElement getTimeofbirth() {
			return timeofbirth;
		}
		
		
		
		
		
		
		
		
		
}


