import java.util.*;


interface Alt
{
	public void attend(String Cmp_Name,int Emp_Wage_per_Hr,int No_Days,int Work_Hrs );	
}

class Hello
{
        void Welcome()
        {
        System.out.println("Welcome to Employee Wage Computation Program on Master Computation");
        }
}

class Attend1 implements Alt
{
	int Emp_Wage_per_Hr,day=0,Total_Hrs=0,No_Days,Work_Hrs;
	int full_day=8,part_day=4,EmpWage,hrs,Total_Wage=0;
	String Company,Cmp_Name;

	public void attend(String Cmp_Name,int Emp_Wage_per_Hr,int No_Days,int Work_Hrs ) 
	{
	
	while(Total_Hrs < Work_Hrs && day < No_Days)
	{
		int p=(int)Math.floor(Math.random()*10)%3;
		switch(p) 
		{
		case 1:
		//System.out.println("Present");
		hrs=full_day;
		day=day+1;
		Total_Hrs=Total_Hrs+hrs;
		break;
		case 2:
		//System.out.println("Part Day");
		hrs=part_day;
		day=day+(1/2);
		Total_Hrs=Total_Hrs+hrs;
		break;
		default:
		//System.out.println("Absent");
		hrs=0;
		day=day+0;
		Total_Hrs=Total_Hrs+hrs;
		break;
		}
		EmpWage=Emp_Wage_per_Hr*hrs;
		//System.out.println("Employee Wage: "+EmpWage+" Total Hrs: "+Total_Hrs+" On Day: " +day);
		Total_Wage=Total_Wage+EmpWage;
		Company=Cmp_Name;
	}
	//System.out.println("Total Wage: "+Total_Wage);	
	}
}
class CompanyEmpWage extends Attend1 
{
	
}
class EmpWage
{
        public static void main(String[] args)
        {

		ArrayList<Attend1> at=new ArrayList<Attend1>();

                Hello A1 = new Hello();
                A1.Welcome();
		Alt Reliance=new CompanyEmpWage(); 
		Alt TCS =new CompanyEmpWage();
		Alt GVK =new CompanyEmpWage();
		Alt Tata =new CompanyEmpWage();


		Reliance.attend("Reliance",20,20,6);
		Tata.attend("Tata",10, 200, 8);
		TCS.attend("TCS",15, 205, 6);
		GVK.attend("GVK",35, 265, 7);

		at.add((Attend1) Reliance);
		at.add((Attend1)TCS);
		at.add((Attend1)GVK);
		at.add((Attend1)Tata);


		for(int i=0;i<=at.size()-1;i++) 
		{
			Attend1 ntr=at.get(i);
			System.out.println("Company Name: "+ntr.Company+"|"+" Total Wage: "+ntr.Total_Wage);
		}

       }
}
