import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import javax.swing.*;
class Start {
	static FoodCourt f = new FoodCourt();
	static FileReadWriteDemo file_read = new FileReadWriteDemo();
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		new JFream1();


	}
	static class JFream1 extends JFrame implements ActionListener {
		private JButton emp1, res1, res_food1, Food_ad_sell, Exit1;
		private JPanel panel1;
		private Font myFont;

		public JFream1() {
			super("Food Court Management System");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));


			emp1 = new JButton("1. Employee Management");
			emp1.setFont(myFont);
			emp1.setBounds(350, 125, 300, 50);
			emp1.setBackground(new Color(0xA9E5EF));
			emp1.addActionListener(this);
			panel1.add(emp1);


			res1 = new JButton("Restaurant Management");
			res1.setFont(myFont);
			res1.setBounds(350, 225, 300, 50);
			res1.setBackground(new Color(0xA9E5EF));
			res1.addActionListener(this);
			panel1.add(res1);


			res_food1 = new JButton("Restaurant FoodItem Management");
			res_food1.setFont(myFont);
			res_food1.setBounds(350, 325, 300, 50);
			res_food1.setBackground(new Color(0xA9E5EF));
			res_food1.addActionListener(this);
			panel1.add(res_food1);


			Food_ad_sell = new JButton("FoodItem Quantity Add-Sell");
			Food_ad_sell.setFont(myFont);
			Food_ad_sell.setBounds(350, 425, 300, 50);
			Food_ad_sell.setBackground(new Color(0xA9E5EF));
			Food_ad_sell.addActionListener(this);
			panel1.add(Food_ad_sell);


			Exit1 = new JButton("Exit");
			Exit1.setFont(myFont);
			Exit1.setBounds(350, 525, 300, 50);
			Exit1.setBackground(new Color(0xD70303));
			Exit1.addActionListener(this);
			panel1.add(Exit1);


			this.add(panel1);
			this.setVisible(true);
		}


		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();

			if (ae.getSource() == emp1) {
				empfrem e1 = new empfrem();
				e1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == res1) {
				resfream r1 = new resfream();
				r1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == res_food1) {
				resfoodfream rf1 = new resfoodfream();
				rf1.setVisible(true);
				this.setVisible(false);

			} else if (ae.getSource() == Food_ad_sell) {
				foodaddfream fadd1 = new foodaddfream();
				fadd1.setVisible(true);
				this.setVisible(false);


			} else if (ae.getSource() == Exit1) {
				this.dispose();
				System.exit(1);
			}


		}


	}
	static class empfrem extends JFrame implements ActionListener {

		private JButton insEmp, revEmp, SowAll, srhEmp, back;
		private JPanel panel1;
		private Font myFont;
		private int opt1;

		public empfrem() {
			super("Employee Management");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			insEmp = new JButton("Insert New Employee");
			insEmp.setFont(myFont);
			insEmp.setBounds(350, 125, 300, 50);
			insEmp.setBackground(new Color(0xA9E5EF));
			insEmp.addActionListener(this);
			panel1.add(insEmp);


			revEmp = new JButton("Remove Existing Employee");
			revEmp.setFont(myFont);
			revEmp.setBounds(350, 225, 300, 50);
			revEmp.setBackground(new Color(0xA9E5EF));
			revEmp.addActionListener(this);
			panel1.add(revEmp);

			SowAll = new JButton("Show All Employees");
			SowAll.setFont(myFont);
			SowAll.setBounds(350, 325, 300, 50);
			SowAll.setBackground(new Color(0xA9E5EF));
			SowAll.addActionListener(this);
			panel1.add(SowAll);

			srhEmp = new JButton("Search a Employee");
			srhEmp.setFont(myFont);
			srhEmp.setBounds(350, 425, 300, 50);
			srhEmp.setBackground(new Color(0xA9E5EF));
			srhEmp.addActionListener(this);
			panel1.add(srhEmp);

			back = new JButton("Go Back");
			back.setFont(myFont);
			back.setBounds(350, 525, 300, 50);
			back.setBackground(new Color(0xA9E5EF));
			back.addActionListener(this);
			panel1.add(back);


			this.add(panel1);
			this.setVisible(true);


		}


		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == insEmp) {
				InsEmpFr e1 = new InsEmpFr();
				e1.setVisible(true);
				this.setVisible(false);

			} else if (ae.getSource() == revEmp) {
				RvmEmp jf1 = new RvmEmp();
				jf1.setVisible(true);
				this.setVisible(false);


			} else if (ae.getSource() == back) {
				JFream1 jf1 = new JFream1();
				jf1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == SowAll) {
				ShowAllEmp e1 = new ShowAllEmp();
				e1.setVisible(true);
				this.setVisible(false);


			} else if (ae.getSource() == srhEmp) {
				SearchEmp s1 = new SearchEmp();
				s1.setVisible(true);
				this.setVisible(false);
			}


		}
	}
	static class InsEmpFr extends JFrame implements ActionListener {
		private JTextField empID, empName, empSalary;
		private JButton createEmp, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel empid,empnm,empsal;

		public InsEmpFr() {
			super("Insert Employee");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);


			myFont = new Font("Times new Roman", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));


			empID = new JTextField("");
			empID.setFont(myFont);
			empID.setBounds(250, 100, 550, 50);
			panel1.add(empID);

			empName = new JTextField("");
			empName.setFont(myFont);
			empName.setBounds(250, 200, 550, 50);
			panel1.add(empName);

			empSalary = new JTextField("");
			empSalary.setFont(myFont);
			empSalary.setBounds(250, 300, 550, 50);
			panel1.add(empSalary);


			createEmp = new JButton("Create Employee");
			createEmp.setFont(myFont);
			createEmp.setBounds(400, 400, 200, 70);
			createEmp.setBackground(new Color(0x058CA2));
			createEmp.addActionListener(this);
			panel1.add(createEmp);

			empid = new JLabel("Enter Emp. ID");
			empid.setFont(myFont);
			empid.setBounds(250,  50, 200, 50);
			panel1.add(empid);

			empnm = new JLabel("Enter Emp. Name");
			empnm.setFont(myFont);
			empnm.setBounds(250,  150, 200, 50);
			panel1.add(empnm);

			empsal = new JLabel("Enter Emp. Salary");
			empsal.setFont(myFont);
			empsal.setBounds(250,  250, 200, 50);
			panel1.add(empsal);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(400, 500, 200, 70);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);


			this.add(panel1);
			this.setVisible(true);


		}


		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String a1 = empID.getText();
			String a2 = empName.getText();
			String a3 = empSalary.getText();
			if (ae.getSource() == createEmp) {
				Employee e1 = new Employee(a1, a2, Integer.parseInt(a3));
				f.insertEmployee(e1);
			} else if (ae.getSource() == back) {
				empfrem jf1 = new empfrem();
				jf1.setVisible(true);
				this.setVisible(false);

			}
		}


	}
	static class AddFood extends JFrame implements ActionListener {
		private JTextField resID, fid, fiq;
		private JButton add, back;
		private JPanel panel1;
		private Font myFont;

		public AddFood() {
			super("Add Food");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);


			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			resID = new JTextField("Enter Restaurant ID");
			resID.setFont(myFont);
			resID.setBounds(250, 100, 550, 50);
			panel1.add(resID);

			fid = new JTextField("Enter Food ID");
			fid.setFont(myFont);
			fid.setBounds(250, 200, 550, 50);
			panel1.add(fid);

			fiq = new JTextField("Enter Food Quantity");
			fiq.setFont(myFont);
			fiq.setBounds(250, 300, 550, 50);
			panel1.add(fiq);


			add = new JButton("Add");
			add.setFont(myFont);
			add.setBounds(250, 500, 200, 70);
			add.setBackground(new Color(0x058CA2));
			add.addActionListener(this);
			panel1.add(add);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(500, 500, 200, 70);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);

		}


		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String a1 = resID.getText();
			String a2 = fid.getText();
			String a3 = fiq.getText();

			if (ae.getSource() == back) {
				foodaddfream af = new foodaddfream();
				af.setVisible(true);
				this.setVisible(false);

			} else if (ae.getSource()==add) {
				if (f.searchRestaurant(a1).searchFoodItem(a2) != null){
					if (f.searchRestaurant(a1).searchFoodItem(a2).addQuantity(Integer.parseInt(a3))){
						file_read.writeInFile("Amount : " + a3 + "  added in " + a2 + " by " + a1);
					}
				}

			}
		}


	}
	static class foodaddfream extends JFrame implements ActionListener {

		private JButton Add, Sell, Back;
		private JPanel panel1;
		private Font myFont;

		public foodaddfream() {
			super("FoodItem Quantity Add-Sell");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));


			Add = new JButton("Add Food Item");
			Add.setFont(myFont);
			Add.setBounds(400, 100, 250, 50);
			Add.setBackground(new Color(0xA9E5EF));
			Add.addActionListener(this);
			panel1.add(Add);


			Sell = new JButton("Sell Food Item");
			Sell.setFont(myFont);
			Sell.setBounds(400, 250, 250, 50);
			Sell.setBackground(new Color(0xA9E5EF));
			Sell.addActionListener(this);
			panel1.add(Sell);


			Back = new JButton("Go Back");
			Back.setFont(myFont);
			Back.setBounds(400, 400, 250, 50);
			Back.setBackground(new Color(0xA9E5EF));
			Back.addActionListener(this);
			panel1.add(Back);


			this.add(panel1);
			this.setVisible(true);

		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == Back) {
				JFream1 jf1 = new JFream1();
				jf1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == Add) {
				AddFood af = new AddFood();
				af.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == Sell) {
				SellFood af = new SellFood();
				af.setVisible(true);
				this.setVisible(false);
			}

		}
	}
	static class InsNewFood extends JFrame implements ActionListener {
		private JTextField ResID, FoodID, FoodName, AvailableQuantity, FoodPrice, FoodCategory, FoodSize;
		private JTextArea textBox;
		private JButton MainDish, Appetizers, back;
		private JPanel panel1;
		private Font myFont;

		public InsNewFood() {
			super("Add New Food");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);


			myFont = new Font("Times new Roman", Font.PLAIN, 14);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));


			ResID = new JTextField("Restaurant ID");
			ResID.setFont(myFont);
			ResID.setBounds(50, 50, 400, 50);
			panel1.add(ResID);


			FoodID = new JTextField("Food ID");
			FoodID.setFont(myFont);
			FoodID.setBounds(50, 150, 400, 50);
			panel1.add(FoodID);


			FoodName = new JTextField("FoodName");
			FoodName.setFont(myFont);
			FoodName.setBounds(50, 250, 400, 50);
			panel1.add(FoodName);


			AvailableQuantity = new JTextField("AvailableQuantity");
			AvailableQuantity.setFont(myFont);
			AvailableQuantity.setBounds(50, 350, 400, 50);
			panel1.add(AvailableQuantity);


			FoodPrice = new JTextField("FoodPrice");
			FoodPrice.setFont(myFont);
			FoodPrice.setBounds(500, 50, 400, 50);
			panel1.add(FoodPrice);


			FoodCategory = new JTextField("FoodCategory(MainDish)");
			FoodCategory.setFont(myFont);
			FoodCategory.setBounds(500, 150, 400, 50);
			panel1.add(FoodCategory);


			FoodSize = new JTextField("FoodSize(Appetizers)");
			FoodSize.setFont(myFont);
			FoodSize.setBounds(500, 250, 400, 50);
			panel1.add(FoodSize);

			textBox = new JTextArea("Msg Box");
			textBox.setFont(myFont);
			textBox.setBounds(500, 350, 400, 350);
			panel1.add(textBox);

			MainDish = new JButton("MainDish");
			MainDish.setFont(myFont);
			MainDish.setBounds(50, 450, 200, 50);
			MainDish.setBackground(new Color(0xA4EAF3));
			MainDish.addActionListener(this);
			panel1.add(MainDish);

			Appetizers = new JButton("Appetizers");
			Appetizers.setFont(myFont);
			Appetizers.setBounds(50, 550, 200, 50);
			Appetizers.setBackground(new Color(0xA4EAF3));
			Appetizers.addActionListener(this);
			panel1.add(Appetizers);


			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(50, 650, 200, 50);
			back.setBackground(new Color(0xF18484));
			back.addActionListener(this);
			panel1.add(back);


			this.add(panel1);
			this.setVisible(true);
		}


		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String ReID = ResID.getText();
			String fdid = FoodID.getText();
			String fdname = FoodName.getText();
			String AvQtity = AvailableQuantity.getText();
			String FdPrice = FoodPrice.getText();
			String FdCate = FoodCategory.getText();
			String FdSize = FoodSize.getText();

			if (ae.getSource() == back) {
				resfoodfream jf1 = new resfoodfream();
				jf1.setVisible(true);
				this.setVisible(false);


			} else if (ae.getSource() == MainDish) {
				textBox.append("MainDish clicked");
					FoodItem m31 = new MainDish(fdid, fdname, Integer.parseInt(AvQtity), Double.parseDouble(FdPrice), FdCate);
						if (f.searchRestaurant(ReID).insertFoodItem(m31)) {
							textBox.append("Food Id Number" + fdid + "inserted for" + ReID);
						} else {textBox.append("Food Item Can Not be inserted");}

			} else if (ae.getSource() == Appetizers) {
				FoodItem m31 = new Appetiziers(fdid, fdname, Integer.parseInt(AvQtity), Double.parseDouble(FdPrice), FdSize);
				if (f.searchRestaurant(ReID).insertFoodItem(m31)) {
					textBox.append("Food Id Number" + fdid);
				}else {textBox.append("Food Item Can Not be inserted");}
			}
		}
	}
	static class InsResfrm extends JFrame implements ActionListener {
		private JTextField resID, resName;
		private JButton createRes, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel rid,rnm;

		public InsResfrm() {
			super("Insert Restaurant");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			resID = new JTextField("");
			resID.setFont(myFont);
			resID.setBounds(250, 100, 550, 50);
			panel1.add(resID);

			resName = new JTextField("");
			resName.setFont(myFont);
			resName.setBounds(250, 200, 550, 50);
			panel1.add(resName);

			createRes = new JButton("Create Restaurant");
			createRes.setFont(myFont);
			createRes.setBounds(400, 400, 200, 70);
			createRes.setBackground(new Color(0x058CA2));
			createRes.addActionListener(this);
			panel1.add(createRes);

			rid = new JLabel("Enter Restaurant ID");
			rid.setFont(myFont);
			rid.setBounds(250,  50, 200, 50);
			panel1.add(rid);

			rnm = new JLabel("Enter Restaurant Name");
			rnm.setFont(myFont);
			rnm.setBounds(250,  150, 200, 50);
			panel1.add(rnm);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(400, 500, 200, 70);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);

		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String a1 = resID.getText();
			String a2 = resName.getText();
			if (ae.getSource() == createRes) {
				Restaurant r1 = new Restaurant(a1, a2);
				f.insertRestaurant(r1);
			} else if (ae.getSource() == back) {
				resfream rf = new resfream();
				rf.setVisible(true);
				this.setVisible(false);

			}
		}

	}
	static class resfoodfream extends JFrame implements ActionListener {
		private JLabel label;
		private JButton Ins_new_Food_Item, RmvFood, Srh_Food, Back;
		private JPanel panel1;
		private Font myFont;

		public resfoodfream() {
			super("Restaurant FoodItem Management");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			Ins_new_Food_Item = new JButton("Insert New Food Item");
			Ins_new_Food_Item.setFont(myFont);
			Ins_new_Food_Item.setBounds(350, 100, 250, 50);
			Ins_new_Food_Item.setBackground(new Color(0xA9E5EF));
			Ins_new_Food_Item.addActionListener(this);
			panel1.add(Ins_new_Food_Item);

			RmvFood = new JButton("Remove Existing Food Item");
			RmvFood.setFont(myFont);
			RmvFood.setBounds(350, 200, 250, 50);
			RmvFood.setBackground(new Color(0xA9E5EF));
			RmvFood.addActionListener(this);
			panel1.add(RmvFood);

			Srh_Food = new JButton("Search a Food Item");
			Srh_Food.setFont(myFont);
			Srh_Food.setBounds(350, 300, 250, 50);
			Srh_Food.setBackground(new Color(0xA9E5EF));
			Srh_Food.addActionListener(this);
			panel1.add(Srh_Food);

			Back = new JButton("Go Back");
			Back.setFont(myFont);
			Back.setBounds(350, 400, 250, 50);
			Back.setBackground(new Color(0xA9E5EF));
			Back.addActionListener(this);
			panel1.add(Back);

			this.add(panel1);
			this.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == Back) {
				JFream1 jf1 = new JFream1();
				jf1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == Ins_new_Food_Item) {
				InsNewFood inf = new InsNewFood();
				inf.setVisible(true);
				this.setVisible(false);

			} else if (ae.getSource() == RmvFood) {
				RvmFood inf = new RvmFood();
				inf.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == Srh_Food) {
				SearchFood inf = new SearchFood();
				inf.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class resfream extends JFrame implements ActionListener {
		private JButton ires, rres, sallres, sres, gb;
		private JPanel panel1;
		private Font myFont;

		public resfream() {
			super("Restaurant Management");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			ires = new JButton("Insert New Restaurant");
			ires.setFont(myFont);
			ires.setBounds(350, 125, 300, 50);
			ires.setBackground(new Color(0xA9E5EF));
			ires.addActionListener(this);
			panel1.add(ires);

			rres = new JButton("Remove Existing Restaurant");
			rres.setFont(myFont);
			rres.setBounds(350, 225, 300, 50);
			rres.setBackground(new Color(0xA9E5EF));
			rres.addActionListener(this);
			panel1.add(rres);

			sallres = new JButton("Show All Restaurants");
			sallres.setFont(myFont);
			sallres.setBounds(350, 325, 300, 50);
			sallres.setBackground(new Color(0xA9E5EF));
			sallres.addActionListener(this);
			panel1.add(sallres);

			sres = new JButton("Search a Restaurant");
			sres.setFont(myFont);
			sres.setBounds(350, 425, 300, 50);
			sres.setBackground(new Color(0xA9E5EF));
			sres.addActionListener(this);
			panel1.add(sres);

			gb = new JButton("Go Back");
			gb.setFont(myFont);
			gb.setBounds(350, 525, 300, 50);
			gb.setBackground(new Color(0xA9E5EF));
			gb.addActionListener(this);
			panel1.add(gb);

			this.add(panel1);
			this.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == ires) {
				InsResfrm rf = new InsResfrm();
				rf.setVisible(true);
				this.setVisible(false);

			} else if (ae.getSource() == rres) {
				RvmResfrm rf = new RvmResfrm();
				rf.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == sallres) {
				ShowAllRes e1 = new ShowAllRes();
				e1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == sres) {
				SearchRes sr = new SearchRes();
				sr.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == gb) {
				JFream1 rf = new JFream1();
				rf.setVisible(true);
				this.setVisible(false);

			}

		}
	}
	static class RvmEmp extends JFrame implements ActionListener {
		private JTextField empID;
		private JButton RemoveEmp, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel empid;

		public RvmEmp() {
			super("Remove Employee");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			empID = new JTextField("");
			empID.setFont(myFont);
			empID.setBounds(250, 100, 550, 50);
			panel1.add(empID);

			RemoveEmp = new JButton("Remove Employee");
			RemoveEmp.setFont(myFont);
			RemoveEmp.setBounds(250, 300, 500, 60);
			RemoveEmp.setBackground(new Color(0x8CEEEB));
			RemoveEmp.addActionListener(this);
			panel1.add(RemoveEmp);

			empid = new JLabel("Enter Emp. ID");
			empid.setFont(myFont);
			empid.setBounds(250,  50, 200, 50);
			panel1.add(empid);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(350, 400, 300, 60);
			back.setBackground(new Color(0x8CEEEB));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == RemoveEmp) {
				for (int i = 0; i < FoodCourt.employees.length; i++) {
					if (FoodCourt.employees[i] != null) {
						if (FoodCourt.employees[i].getEmpId().equals(empID.getText())) {
							FoodCourt.employees[i] = null;
							break;
						}
					}
				}
			} else if (ae.getSource() == back) {
				empfrem jf1 = new empfrem();
				jf1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class RvmFood extends JFrame implements ActionListener {
		private JTextField ResID, FoodID;
		private JButton RmvFood, back;
		private JPanel panel1;
		private Font myFont;

		public RvmFood() {
			super("Remove Food");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 14);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			ResID = new JTextField("Restaurant ID");
			ResID.setFont(myFont);
			ResID.setBounds(150, 50, 400, 50);
			panel1.add(ResID);

			FoodID = new JTextField("Food ID");
			FoodID.setFont(myFont);
			FoodID.setBounds(150, 150, 400, 50);
			panel1.add(FoodID);

			RmvFood = new JButton("Remove Food");
			RmvFood.setFont(myFont);
			RmvFood.setBounds(150, 250, 200, 50);
			RmvFood.setBackground(new Color(0xA4EAF3));
			RmvFood.addActionListener(this);
			panel1.add(RmvFood);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(150, 350, 200, 50);
			back.setBackground(new Color(0xF18484));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);

		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String rid=ResID.getText();
			String fid=FoodID.getText();

			if (ae.getSource() == back) {
				resfoodfream jf1 = new resfoodfream();
				jf1.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource() == RmvFood) {
				if (f.searchRestaurant(rid) != null) {
					Restaurant r322 = f.searchRestaurant(rid);
					FoodItem f322 = r322.searchFoodItem(fid);
					if (f322 != null) {
						r322.removeFoodItem(f322);
					}
				}
			}
		}

	}
	static class RvmResfrm extends JFrame implements ActionListener {
		private JTextField resID;
		private JButton RemoveRes, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel rid;

		public RvmResfrm() {
			super("Remove Restaurant");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			resID = new JTextField("");
			resID.setFont(myFont);
			resID.setBounds(250, 100, 550, 50);
			panel1.add(resID);

			RemoveRes = new JButton("Remove Restaurant");
			RemoveRes.setFont(myFont);
			RemoveRes.setBounds(250, 300, 500, 60);
			RemoveRes.setBackground(new Color(0x8CEEEB));
			RemoveRes.addActionListener(this);
			panel1.add(RemoveRes);

			rid = new JLabel("Enter Restaurant ID");
			rid.setFont(myFont);
			rid.setBounds(250,  50, 200, 50);
			panel1.add(rid);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(350, 400, 300, 60);
			back.setBackground(new Color(0x8CEEEB));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == RemoveRes) {
				for (int i = 0; i < FoodCourt.restaurants.length; i++) {
					if (FoodCourt.restaurants[i] != null) {
						if (FoodCourt.restaurants[i].getRid().equals(resID.getText())) {
							FoodCourt.restaurants[i] = null;
							break;
						}
					}
				}
			} else if (ae.getSource() == back) {
				resfream rf = new resfream();
				rf.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class SearchEmp extends JFrame implements ActionListener {
		private JTextField empID;
		private JTextArea textBox;
		private JButton srchemp, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel sempid;

		public SearchEmp() {
			super("Search Employee");
			this.setSize(900, 700);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);
			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 900, 700);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			srchemp = new JButton("Search Employee");
			srchemp.setFont(myFont);
			srchemp.setBounds(100, 600, 250, 50);
			srchemp.setBackground(new Color(0xA9E5EF));
			srchemp.addActionListener(this);
			panel1.add(srchemp);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(350, 600, 250, 50);
			back.setBackground(new Color(0x8CEEEB));
			back.addActionListener(this);
			panel1.add(back);

			sempid = new JLabel("Enter Employee ID");
			sempid.setFont(myFont);
			sempid.setBounds(100,  50, 200, 50);
			panel1.add(sempid);

			empID = new JTextField("");
			empID.setFont(myFont);
			empID.setBounds(100, 100, 550, 50);
			panel1.add(empID);

			textBox = new JTextArea();
			textBox.setFont(myFont);
			textBox.setBounds(100, 250, 550, 300);
			panel1.add(textBox);

			this.add(panel1);
			this.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == srchemp) {
				for (int i = 0; i < FoodCourt.employees.length; i++) {
					if (FoodCourt.employees[i] != null) {
						if (FoodCourt.employees[i].getEmpId().equals(empID.getText())) {
							String s = "NAME : " + FoodCourt.showAllName(i) +
									"\nID : " + FoodCourt.showAllId(i) +
									"\nSalary : " + FoodCourt.showAllSalary(i) + "\n";
							textBox.append(s);
							break;
						}
					}
				}
			} else if (ae.getSource() == back) {
				empfrem jf1 = new empfrem();
				jf1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class SearchFood extends JFrame implements ActionListener {
		private JTextField ResID, FoodID;
		private JTextArea textBox;
		private JButton RmvFood, back;
		private JPanel panel1;
		private Font myFont;
		public SearchFood() {
			super("Search Food");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 14);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			ResID = new JTextField("Restaurant ID");
			ResID.setFont(myFont);
			ResID.setBounds(150, 50, 400, 50);
			panel1.add(ResID);

			FoodID = new JTextField("Food ID");
			FoodID.setFont(myFont);
			FoodID.setBounds(150, 150, 400, 50);
			panel1.add(FoodID);

			textBox = new JTextArea("Msg Box");
			textBox.setFont(myFont);
			textBox.setBounds(500, 350, 400, 350);
			panel1.add(textBox);

			RmvFood = new JButton("Search Food");
			RmvFood.setFont(myFont);
			RmvFood.setBounds(150, 250, 200, 50);
			RmvFood.setBackground(new Color(0xA4EAF3));
			RmvFood.addActionListener(this);
			panel1.add(RmvFood);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(150, 350, 200, 50);
			back.setBackground(new Color(0xF18484));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);
		}

		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String rid=ResID.getText();
			String fid=FoodID.getText();

			if (ae.getSource() == RmvFood) {
				if (f.searchRestaurant(rid) != null) {
					Restaurant r44 = f.searchRestaurant(rid);
					FoodItem f44 = r44.searchFoodItem(fid);
					if (f44 != null) {
						textBox.append("FoodItem has been founded In ResID: "+rid+"\nFood Id :"+fid+"\n"+r44.getName());
					}else {
						textBox.append("No FoodItem Found");
					}
				}
			} else if (ae.getSource() == back) {
				resfoodfream jf1 = new resfoodfream();
				jf1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class SearchRes extends JFrame implements ActionListener {
		private JTextField resID;
		private JTextArea textBox;
		private JButton srchres, back;
		private JPanel panel1;
		private Font myFont;
		private JLabel rid;

		public SearchRes() {
			super("Search Restaurant");
			this.setSize(900, 700);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 900, 700);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			srchres = new JButton("Search Restaurant");
			srchres.setFont(myFont);
			srchres.setBounds(100, 600, 250, 50);
			srchres.setBackground(new Color(0xA9E5EF));
			srchres.addActionListener(this);
			panel1.add(srchres);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(350, 600, 250, 50);
			back.setBackground(new Color(0x8CEEEB));
			back.addActionListener(this);
			panel1.add(back);

			resID = new JTextField("");
			resID.setFont(myFont);
			resID.setBounds(100, 100, 550, 50);
			panel1.add(resID);

			rid = new JLabel("Enter Restaurant ID");
			rid.setFont(myFont);
			rid.setBounds(100,  50, 200, 50);
			panel1.add(rid);

			textBox = new JTextArea();
			textBox.setFont(myFont);
			textBox.setBounds(100, 250, 550, 300);
			panel1.add(textBox);

			this.add(panel1);
			this.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			if (ae.getSource() == srchres) {
				for (int i = 0; i < FoodCourt.restaurants.length; i++) {
					if (FoodCourt.restaurants[i] != null) {
						if (FoodCourt.restaurants[i].getRid().equals(resID.getText())) {
							String s = "NAME : " + FoodCourt.showAllRName(i) +
									"\nID : " + FoodCourt.showAllRId(i);
							textBox.append(s);
							textBox.append("\n---restaurant found---");
							break;
						}
					}
				}
			} else if (ae.getSource() == back) {
				resfream rf = new resfream();
				rf.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class SellFood extends JFrame implements ActionListener {
		private JTextField resID, fid, fiq;
		private JButton sell, back;
		private JPanel panel1;
		private Font myFont;
		public SellFood() {
			super("Sell Food ");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Cambria", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			resID = new JTextField("Enter Restaurant ID");
			resID.setFont(myFont);
			resID.setBounds(250, 100, 550, 50);
			panel1.add(resID);

			fid = new JTextField("Enter Food ID");
			fid.setFont(myFont);
			fid.setBounds(250, 200, 550, 50);
			panel1.add(fid);

			fiq = new JTextField("Enter Food Quantity");
			fiq.setFont(myFont);
			fiq.setBounds(250, 300, 550, 50);
			panel1.add(fiq);

			sell = new JButton("Sell");
			sell.setFont(myFont);
			sell.setBounds(250, 500, 200, 70);
			sell.setBackground(new Color(0x058CA2));
			sell.addActionListener(this);
			panel1.add(sell);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(500, 500, 200, 70);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			String command = ae.getActionCommand();
			String rid = resID.getText();
			String foodid = fid.getText();
			String fdqu = fiq.getText();
			if (ae.getSource() == back) {
				foodaddfream af = new foodaddfream();
				af.setVisible(true);
				this.setVisible(false);
			} else if (ae.getSource()==sell) {
				if (f.searchRestaurant(rid) != null) {
					if (f.searchRestaurant(rid).searchFoodItem(foodid) != null) {
						f.searchRestaurant(rid).searchFoodItem(foodid).sellQuantity(Integer.parseInt(fdqu));
					}
				}
			}
		}
	}
	static class ShowAllEmp extends JFrame implements ActionListener {
		private JTextArea showAll;
		private JPanel panel1;
		private Font myFont;
		private JButton back;
		public ShowAllEmp() {
			super("Show all Employee.");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			showAll = new JTextArea();
			for (int i = 0; i < FoodCourt.employees.length; i++) {
				if (FoodCourt.employees[i] != null) {
					String s = "NAME : " + FoodCourt.showAllName(i) +
							"\nID : " + FoodCourt.showAllId(i) +
							"\nSalary : " + FoodCourt.showAllSalary(i) + "\n";
					showAll.append(s);
				}
			}

			showAll.setFont(myFont);
			showAll.setBounds(25, 30, 700, 700);
			panel1.add(showAll);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(750, 50, 150, 50);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);

		}
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == back) {
				empfrem jf1 = new empfrem();
				jf1.setVisible(true);
				this.setVisible(false);
			}
		}
	}
	static class ShowAllRes extends JFrame implements ActionListener {
		private JTextArea showAll2;
		private JPanel panel1;
		private Font myFont;
		private JButton back;
		public ShowAllRes() {
			super("Show all Restaurant");
			this.setSize(1000, 800);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			this.setLayout(null);

			myFont = new Font("Times new Roman", Font.PLAIN, 18);
			panel1 = new JPanel();
			panel1.setBounds(0, 0, 1000, 800);
			panel1.setLayout(null);
			panel1.setBackground(new Color(250, 237, 205));

			showAll2 = new JTextArea();
			for (int i = 0; i < FoodCourt.restaurants.length; i++) {
				if (FoodCourt.restaurants[i] != null) {
					String s = "NAME : " + FoodCourt.showAllRName(i) +
							"\nID : " + FoodCourt.showAllRId(i);
					showAll2.append(s);
					break;
				}
			}
			showAll2.setFont(myFont);
			showAll2.setBounds(25, 30, 700, 700);
			panel1.add(showAll2);

			back = new JButton("Back");
			back.setFont(myFont);
			back.setBounds(750, 50, 150, 50);
			back.setBackground(new Color(0x058CA2));
			back.addActionListener(this);
			panel1.add(back);

			this.add(panel1);
			this.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			if (ae.getSource() == back) {
				resfream rf = new resfream();
				rf.setVisible(true);
				this.setVisible(false);
			}
		}
	}
}
