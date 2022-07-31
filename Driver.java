package stationery;

import java.util.Scanner;

interface PenPencilMarkerAB {
	void write();

	void draw();
}

interface PenMarkerAB extends PenPencilMarkerAB {
	void capOpen();

	void capClose();
}

//------------------------------------------------------------------------------------------------------------------
//Level 1
class stationery {
	static {
		System.out.println("Welcome to Stationary shop");
		System.out.println("Press 1 for Pen");
		System.out.println("Press 2 for Pencil");
		System.out.println("Press 3 for Marker");
	}

	String name;
	private int price;
	String brand_name;
	String type;

//*****************************************************************************************
	public int getPrice() { // Getter
		return price;
	}

	public void setPrice(int price) { // Setter
		this.price = price;
	}
}
//*****************************************************************************************

//Level 2 Stationary
class Pen extends stationery implements PenMarkerAB, PenPencilMarkerAB {

	public void write() {
		System.out.println("Pen is able to write");
	}

	public void draw() {
		System.out.println("Pen is able to draw");
	}

	public void capOpen() {
		System.out.println("Pen's cap is open");
	}

	public void capClose() {
		System.out.println("Pen's cap is closed");
	}
}
//*****************************************************************************************

class Pencil extends stationery implements PenPencilMarkerAB {
	public void write() {
		System.out.println("Pencil is able to write");
	}

	public void draw() {
		System.out.println("Pencil is able to draw");
	}
}
//*****************************************************************************************

class Marker extends stationery implements PenMarkerAB, PenPencilMarkerAB {
	public void capOpen() {
		System.out.println("Marker's cap is open");
	}

	public void capClose() {
		System.out.println("Marker's cap is closed");
	}

	public void write() {
		System.out.println("Marker is able to write");
	}

	public void draw() {
		System.out.println("Marker is able to draw");
	}
}

//Level 3 Pen******************************************************************************************

class Gel extends Pen {
	String type = "Gel";

}

class BallPoint extends Pen {

	String type = "BallPoint";
}

class Fountain extends Pen {

	String type = "Fountain";
}

//Level 3 pencil******************************************************************************************
class Mechanical extends Pencil {
	String type = "Mechanical";
}

class Graphite extends Pencil {
	String type = "Graphite";
}

class Colored extends Pencil {
	String type = "Colored";
}

//Level 3 Marker
class Permanent extends Marker {
	String type = "Permanent";
}

class WhiteBoard extends Marker {
	String type = "WhiteBoard";
}

//Level 4 Stationary->Pen->Gel ***************************************************************************************
class Reynolds extends Gel {
	String brand_name = "Reynolds";

}

class Flair extends Gel {
	String brand_name = "Flair";
}

class Pentonic extends Gel {
	String brand_name = "Pentonic";
}

//Level 4 Stationary->Pen->Ballpoint
class Reynolds_ball extends BallPoint {
	String brand_name = "Reynolds_ball";
}

class Cello_ball extends BallPoint {

	String brand_name = "Cello_ball";
}

class Pentonic_ball extends BallPoint {
	String brand_name = "Pentonic_ball";
}

//Level 4 Stationary->Pen->Fountain
class Parker_Fountain extends Fountain {
	String brand_name = "Parker";
}

class Pilot_Fountain extends Fountain {

	String brand_name = "Pilot";
}

class Lamy_Fountain extends Fountain {
	String brand_name = "Lamy";
}

//Level 4 Stationary->Pencil->Mechanical

class Pilot_Mechanical extends Mechanical {

	String brand_name = "Pilot";
}

class Cello_Mechanical extends Mechanical {
	String brand_name = "Cello";
}

//Level 4 Stationary->Pencil->Graphite

class HindustanPencil_Graphite extends Graphite {

	String brand_name = "Hindustan Pencils";
}

class DOMS_Graphite extends Graphite {
	String brand_name = "DOMS";
}

//Level 4 Stationary->Pencil->Colored

class DOMS_Colored extends Colored {

	String brand_name = "DOMS";
}

class FiberCastle_Colored extends Colored {
	String brand_name = "Fiber-Castle";
}

//Level 4 Stationary->Marker->Permanent

class Reynolds_Permanent extends Permanent {

	String brand_name = "Reynolds";
}

class Cello_Permanent extends Permanent {
	String brand_name = "Cello Permanent Marker";
}

//Level 4 Stationary->Marker->WhiteBoard

class Reynolds_WhiteBoard extends WhiteBoard {

	String brand_name = "Reynolds";
}

class Camlin_WhiteBoard extends WhiteBoard {

	String brand_name = "Camlin";
}

class Cello_WhiteBoard extends WhiteBoard {
	String brand_name = "Cello";
}

//******-------------------------------------------------------------------------------------------
//Level 5 Gelpen->Reynolds**************************************************************************************************
class Racer extends Reynolds {
	String name = "Racer Gel";

}

class Lumino extends Reynolds {
	// ******-------------------------------------------------------------------------------------------
	// Level 5
	// Gelpen->Reynolds**************************************************************************************************
	class Racer extends Reynolds {
		String name = "Racer Gel";

	}

	String name = "Lumino Gel";

}

class Mera extends Reynolds {
	String name = "Mera Gel";

}

//Level 5 Gelpen->Flair**************************************************************************************************

class WritoMeter extends Flair {
	String name = "WritoMeter Gel";

}

class Techno extends Flair {
	String name = "Techno Gel";

}

class Hydra extends Flair {
	String name = "Hydra Gel";

}

//Level 5 Gelpen->Pentonic**************************************************************************************************

class Assorted extends Pentonic {
	String name = "Assorted Gel";

}

class Ocean extends Pentonic {
	String name = "Ocean Gel";

}

class Geltonic extends Pentonic {
	String name = "Geltonic Gel";

}

//Level 5 Ballpen->Reynolds_ball**************************************************************************************************
class Champ extends Reynolds_ball {

	String name = "Champ";

}

class Aeroslim extends Reynolds_ball {
	String name = "Aeroslim";

}

class Jetter extends Reynolds_ball {
	String name = "Jetter";

}

//Level 5 Ballpen->Cello_ball**************************************************************************************************
class Butterflow extends Cello_ball {
	String name = "ButterFlow";

}

class Fingertip extends Cello_ball {
	String name = "Fingertip";

}

class Technotip extends Cello_ball {
	String name = "Technotip";

}

//Level 5 Ballpen->Pentonic_ball**************************************************************************************************
class Meeting_G1 extends Pentonic_ball {
	String name = "Meeting_G1";

}

class Glycer extends Pentonic_ball {
	String name = "Glycer";

}

class Signetta extends Pentonic_ball {
	String name = "Signetta";

}

//Level 5 Fountain->Parker_Fountain**************************************************************************************************
class IM extends Parker_Fountain {
	String name = "IM";

}

class Vector extends Parker_Fountain {
	String name = "Vector";

}

class Jotter extends Parker_Fountain {
	String name = "Jotter";

}

//Level 5 Fountain->Pilot_Fountain**************************************************************************************************
class NamikiFalcon extends Pilot_Fountain {
	String name = "NamikiFalcon";

}

class Metropolitan extends Pilot_Fountain {
	String name = "Metropolitan";

}

class Explorer extends Pilot_Fountain {
	String name = "Explorer";

}

//Level 5 Fountain->Lamy_Fountain**************************************************************************************************
class Safari extends Lamy_Fountain {
	String name = "Safari";

}

class Studio extends Lamy_Fountain {
	String name = "Studio";

}

class Vista extends Lamy_Fountain {
	String name = "Vista";

}

//Level 5 Pencil->Mechanical->Pilot_Mechanical**************************************************************************************************
class Rexgrip extends Pilot_Mechanical {
	String name = "Rexgrip";

}

class Progrex extends Pilot_Mechanical {
	String name = "Progrex";

}

class H_329 extends Pilot_Mechanical {
	String name = "H_329";

}

//Level 5 Pencil->Mechanical->Cello_Mechanical**************************************************************************************************
class Supreme extends Cello_Mechanical {
	String name = "Supreme";

}

class Smarty extends Cello_Mechanical {
	String name = "Smarty";

}

class Axis extends Cello_Mechanical {
	String name = "Axis";

}

//Level 5 Pencil->Graphite->HindustanPencil**************************************************************************************************
class Apsara extends HindustanPencil_Graphite {
	String name = "Apsara";

}

class Nataraj extends HindustanPencil_Graphite {
	String name = "Nataraj";

}

//Level 5 Pencil->Graphite->DOMS_Graphite**************************************************************************************************
class Groove extends DOMS_Graphite {
	String name = "Groove";

}

class Fusion extends DOMS_Graphite {
	String name = "Fusion";

}

class ZoomTriangle extends DOMS_Graphite {
	String name = "Zoom Triangle";

}

//Level 5 Pencil->Colored->DOMS**************************************************************************************************
class GrooveColor extends DOMS_Colored {
	String name = "Groove Color";

}

class MegaTriangle extends DOMS_Colored {
	String name = "Mega Triangle";

}

//Level 5 Pencil->Colored->FiberCastle_Colored**************************************************************************************************
class Polychromos extends FiberCastle_Colored {
	String name = "Polychromos";

}

class PittPastle extends FiberCastle_Colored {
	String name = "Pitt Pastle";

}

//Level 5 Marker->Permenent->Reynolds_Permanent**************************************************************************************************
class HD_Permanent extends Reynolds_Permanent {
	String name = "HD Permanent Marker";

}

class Basic_Permanent extends Reynolds_Permanent {
	String name = "Basic Permanent Marker";

}

//Level 5 Marker->Permenent->Cello_Permanent**************************************************************************************************
class Marky_Permanent extends Cello_Permanent {
	String name = "Marky Permanent Marker";

}

class Permaline_Permanent extends Cello_Permanent {
	String name = "Permaline Permanent Marker";

}

//Level 5 Marker->WhiteBoard->Reynolds_WhiteBoard**************************************************************************************************
class HD_WhiteBoard extends Reynolds_WhiteBoard {
	String name = "HD WhiteBoard Marker";

}

class Basic_WhiteBoard extends Reynolds_WhiteBoard {
	String name = "Basic WhiteBoard Marker";

}

//Level 5 Marker->WhiteBoard->Camlin_WhiteBoard**************************************************************************************************
class CamlinPB extends Camlin_WhiteBoard {
	String name = "Camlin pb whiteboard marker";

}

class Bold_e extends Camlin_WhiteBoard {
	String name = "Bold-e marker";

}

//Level 5 Marker->WhiteBoard->Cello_WhiteBoard**************************************************************************************************
class Whitemate extends Cello_WhiteBoard {
	String name = "Whitemate whiteboard marker";

}

class Vivid extends Cello_WhiteBoard {
	String name = "Vivid cello marker";

}

//*********************************************************************************
public class Driver {

	public static void main(String[] args) {
		stationery d1 = new stationery();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		switch (n) { // choose between pen/pencil/marker
		default:
			System.out.println("Please choose Between 1 to 3 numbers only");
			break;
		case 1:
			System.out.println("You have selected Pen");
			System.out.println("******************************");
			Pen Pen_1 = new Pen();
			Pen_1.write();
			Pen_1.draw();
			Pen_1.capOpen();
			Pen_1.capClose();
			System.out.println("******************************");
			System.out.println("Press 1 for Gel");
			System.out.println("Press 2 for Ballpoint");
			System.out.println("Press 3 for Fountain");
			// *********************************************************************************
			int pen = sc.nextInt();
			switch (pen) {
			default:
				System.out.println("Please choose Between 1 to 3 numbers only");
				break; // Default brake
			case 1:

				stationery GelPen1 = new Gel();
				Gel gel1 = (Gel) GelPen1;

				System.out.println("You have selected " + gel1.type);
				System.out.println("Type of selected pen is:- " + gel1.type);
				System.out.println("******************");
				System.out.println("Press 1 for Reynolds");
				System.out.println("Press 2 for Flair");
				System.out.println("Press 3 for Pentonic");

				int GelPen = sc.nextInt();

				switch (GelPen) // gel->reynolds/flair/Pentonic
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break; // Default brake
				case 1: // Stationary->Pen->gel->reynolds

					Gel Reynolds1 = new Reynolds();
					Reynolds Rs1 = (Reynolds) Reynolds1;
					System.out.println("You have selected " + Rs1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Racer");
					System.out.println("Press 2 for Lumino");
					System.out.println("Press 3 for Mera");

					int Reynolds = sc.nextInt();

					switch (Reynolds) // Stationary->Pen->gel->reynolds->Racer/Lumio/Mera
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->gel->reynolds->Racer

						Reynolds Racer1 = new Racer();
						Racer R1 = (Racer) Racer1;
						R1.setPrice(10);
						System.out.println("You have selected " + R1.name);
						System.out.println("******************");
						System.out.println("Price:-" + R1.getPrice());
						System.out.println("Brand Name:-" + R1.brand_name);
						System.out.println("Type:-" + R1.type);
						break; // Case 1 Racer break

					case 2: // Stationary->Pen->gel->reynolds->Lumino

						Reynolds Lumino1 = new Lumino();
						Lumino L1 = (Lumino) Lumino1;
						L1.setPrice(10);
						System.out.println("You have selected " + L1.name);
						System.out.println("******************");
						System.out.println("Price:-" + L1.getPrice());
						System.out.println("Brand Name:-" + L1.brand_name);
						System.out.println("Type:-" + L1.type);
						break;// Case 1 Lumino break

					case 3: // Stationary->Pen->gel->reynolds->Mera

						Reynolds Mera1 = new Mera();
						Mera Me1 = (Mera) Mera1;
						Me1.setPrice(10);
						System.out.println("You have selected " + Me1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Me1.getPrice());
						System.out.println("Brand Name:-" + Me1.brand_name);
						System.out.println("Type:-" + Me1.type);
						break; // Case 1 Mera break
					}
					break; // Case 1 Reynolds break
				// *********************************************************************************
				case 2: // Stationary->Pen->gel->Flair

					Gel Flair1 = new Flair();
					Flair Fl1 = (Flair) Flair1;
					System.out.println("You have selected " + Fl1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Writometer");
					System.out.println("Press 2 for Techno gel");
					System.out.println("Press 3 for Hydra");

					int Flair = sc.nextInt();

					switch (Flair) // Stationary->Pen->gel->Flair->Writometer/Techno/Hydra
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->gel->Flair->Writometer

						Flair WritoMeter1 = new WritoMeter();
						WritoMeter Wr1 = (WritoMeter) WritoMeter1;
						Wr1.setPrice(20);
						System.out.println("You have selected " + Wr1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Wr1.getPrice());
						System.out.println("Brand Name:-" + Wr1.brand_name);
						System.out.println("Type:-" + Wr1.type);
						break; // Case 1 WritoMeter break

					case 2: // Stationary->Pen->gel->Flair->Techno

						Flair Techno1 = new Techno();
						Techno Te1 = (Techno) Techno1;
						Te1.setPrice(50);
						System.out.println("You have selected " + Te1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Te1.getPrice());
						System.out.println("Brand Name:-" + Te1.brand_name);
						System.out.println("Type:-" + Te1.type);
						break; // Case 2 Techno break

					case 3: // Stationary->Pen->gel->Flair->Hydra

						Flair Hydra1 = new Hydra();
						Hydra Hy1 = (Hydra) Hydra1;
						Hy1.setPrice(15);
						System.out.println("You have selected " + Hy1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Hy1.getPrice());
						System.out.println("Brand Name:-" + Hy1.brand_name);
						System.out.println("Type:-" + Hy1.type);
						break; // Case 3 Hydra break
					}
					break; // Case 2 Flair break
				// *************************************************
				case 3: // Stationary->Pen->gel->Pentonic

					Gel Pentonic1 = new Pentonic();
					Pentonic Pe1 = (Pentonic) Pentonic1;
					System.out.println("You have selected " + Pe1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Assorted");
					System.out.println("Press 2 for Ocean");
					System.out.println("Press 3 for Geltonic");

					int Pentonic = sc.nextInt();

					switch (Pentonic) // Stationary->Pen->gel->Pentonic->Assorted/Ocean/Geltonic
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->gel->Pentonic->Assorted

						Pentonic Assorted1 = new Assorted();
						Assorted As1 = (Assorted) Assorted1;
						As1.setPrice(45);
						System.out.println("You have selected " + As1.name);
						System.out.println("******************");
						System.out.println("Price:-" + As1.getPrice());
						System.out.println("Brand Name:-" + As1.brand_name);
						System.out.println("Type:-" + As1.type);
						break; // Case 1 Assorted break

					case 2: // Stationary->Pen->gel->Pentonic->Ocean

						Pentonic Ocean1 = new Ocean();
						Ocean Oc1 = (Ocean) Ocean1;
						Oc1.setPrice(50);
						System.out.println("You have selected " + Oc1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Oc1.getPrice());
						System.out.println("Brand Name:-" + Oc1.brand_name);
						System.out.println("Type:-" + Oc1.type);
						break; // Case 2 Ocean break

					case 3: // Stationary->Pen->gel->Pentonic->Geltonic

						Pentonic Geltonic1 = new Geltonic();
						Geltonic Ge1 = (Geltonic) Geltonic1;
						Ge1.setPrice(25);
						System.out.println("You have selected " + Ge1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ge1.getPrice());
						System.out.println("Brand Name:-" + Ge1.brand_name);
						System.out.println("Type:-" + Ge1.type);
						break; // Case 3 Geltonic break
					}
					break; // Case 3 Pentonic break
				// *************************************************

				}

				break; // Case 1 Gelpen break
			// *GEL PEN
			// FINISHED*******************************************************************************************************************************

			case 2:

				Pen BallPoint1 = new BallPoint();
				BallPoint Ball1 = (BallPoint) BallPoint1;
				System.out.println("You have selected " + Ball1.type);
				System.out.println("Type of selected pen is:- " + Ball1.type);
				System.out.println("******************");
				System.out.println("Press 1 for Reynolds");
				System.out.println("Press 2 for Cello");
				System.out.println("Press 3 for Pentonic");

				int BallPoint = sc.nextInt();

				switch (BallPoint) // BallPoint->reynolds/Cello/Pentonic
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;
				case 1: // Stationary->Pen->BallPoint->Reynolds_ball
					BallPoint Reynolds_ball1 = new Reynolds_ball();
					Reynolds_ball Rb1 = (Reynolds_ball) Reynolds_ball1;

					System.out.println("You have selected " + Rb1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Champ");
					System.out.println("Press 2 for Aeroslim");
					System.out.println("Press 3 for Jetter");

					int Reynolds_ball = sc.nextInt();

					switch (Reynolds_ball) // Stationary->Pen->BallPoint->Reynolds_ball->Champ/Aeroslim/Jetter
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->BallPoint->Reynolds_ball->Champ

						Reynolds_ball Champ1 = new Champ();
						Champ Ch1 = (Champ) Champ1;
						Ch1.setPrice(60);
						System.out.println("You have selected " + Ch1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ch1.getPrice());
						System.out.println("Brand Name:-" + Ch1.brand_name);
						System.out.println("Type:-" + Ch1.type);
						break;

					case 2: // Stationary->Pen->BallPoint->Reynolds_ball->Aeroslim

						Reynolds_ball Aeroslim1 = new Aeroslim();
						Aeroslim Ae1 = (Aeroslim) Aeroslim1;
						Ae1.setPrice(30);
						System.out.println("You have selected " + Ae1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ae1.getPrice());
						System.out.println("Brand Name:-" + Ae1.brand_name);
						System.out.println("Type:-" + Ae1.type);
						break;

					case 3: // Stationary->BallPoint->gel->Reynolds_ball->Jetter

						Reynolds_ball Jetter1 = new Jetter();
						Jetter Je1 = (Jetter) Jetter1;
						Je1.setPrice(10);
						System.out.println("You have selected " + Je1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Je1.getPrice());
						System.out.println("Brand Name:-" + Je1.brand_name);
						System.out.println("Type:-" + Je1.type);
						break;
					}
					break;
				// *********************************************************************************

				case 2: // Stationary->Pen->BallPoint->Cello_ball

					BallPoint Cello_ball1 = new Cello_ball();
					Cello_ball Cb1 = (Cello_ball) Cello_ball1;
					System.out.println("You have selected " + Cb1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Butterflow");
					System.out.println("Press 2 for Fingertip BallPoint");
					System.out.println("Press 3 for Technotip");

					int Cello_ball = sc.nextInt();

					switch (Cello_ball) // Stationary->Pen->BallPoint->Cello_ball->Butterflow/Fingertip/Hydra
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->BallPoint->Cello_ball->Butterflow

						Cello_ball Butterflow1 = new Butterflow();
						Butterflow Bu1 = (Butterflow) Butterflow1;
						Bu1.setPrice(36);
						System.out.println("You have selected " + Bu1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Bu1.getPrice());
						System.out.println("Brand Name:-" + Bu1.brand_name);
						System.out.println("Type:-" + Bu1.type);
						break;

					case 2: // Stationary->Pen->BallPoint->Cello_ball->Fingertip

						Cello_ball Fingertip1 = new Fingertip();
						Fingertip Fi1 = (Fingertip) Fingertip1;
						Fi1.setPrice(31);
						System.out.println("You have selected " + Fi1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Fi1.getPrice());
						System.out.println("Brand Name:-" + Fi1.brand_name);
						System.out.println("Type:-" + Fi1.type);
						break;

					case 3: // Stationary->Pen->BallPoint->Cello_ball->Technotip

						Cello_ball Technotip1 = new Technotip();
						Technotip Te1 = (Technotip) Technotip1;
						Te1.setPrice(26);
						System.out.println("You have selected " + Te1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Te1.getPrice());
						System.out.println("Brand Name:-" + Te1.brand_name);
						System.out.println("Type:-" + Te1.type);
						break;
					}
					break;

				case 3: // Stationary->Pen->BallPoint->Pentonic_ball

					BallPoint Pentonic_ball1 = new Pentonic_ball();
					Pentonic_ball Pe1 = (Pentonic_ball) Pentonic_ball1;

					System.out.println("You have selected " + Pe1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Meeting G1");
					System.out.println("Press 2 for Glycer BallPoint");
					System.out.println("Press 3 for Signetta");

					int Pentonic_ball = sc.nextInt();

					switch (Pentonic_ball) // Stationary->Pen->BallPoint->Pentonic_ball->Butterflow/Glycer/Hydra
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->BallPoint->Pentonic_ball->Meeting G1

						Pentonic_ball MeetingG11 = new Meeting_G1();
						Meeting_G1 Mg1 = (Meeting_G1) MeetingG11;
						Mg1.setPrice(30);
						System.out.println("You have selected " + Mg1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Mg1.getPrice());
						System.out.println("Brand Name:-" + Mg1.brand_name);
						System.out.println("Type:-" + Mg1.type);
						break;

					case 2: // Stationary->Pen->BallPoint->Pentonic_ball->Glycer

						Pentonic_ball Glycer1 = new Glycer();
						Glycer Gl1 = (Glycer) Glycer1;
						Gl1.setPrice(70);
						System.out.println("You have selected " + Gl1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Gl1.getPrice());
						System.out.println("Brand Name:-" + Gl1.brand_name);
						System.out.println("Type:-" + Gl1.type);
						break;

					case 3: // Stationary->Pen->BallPoint->Pentonic_ball->Signetta

						Pentonic_ball Signetta1 = new Signetta();
						Signetta Si1 = (Signetta) Signetta1;
						Si1.setPrice(63);
						System.out.println("You have selected " + Si1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Si1.getPrice());
						System.out.println("Brand Name:-" + Si1.brand_name);
						System.out.println("Type:-" + Si1.type);
						break; // Case 3 Signetta break
					}
					break; // Case 3 Pentonic_ball break
				// till ball point finished

				}
				break; // Case 2 BallPoint break

			case 3:

				Pen Fountain1 = new Fountain();
				Fountain Foun1 = (Fountain) Fountain1;
				System.out.println("You have selected " + Foun1.type);
				System.out.println("Type of selected pen is:- " + Foun1.type);
				System.out.println("******************");
				System.out.println("Press 1 for Parker");
				System.out.println("Press 2 for Pilot");
				System.out.println("Press 3 for Lamy");

				int Fountain = sc.nextInt();

				switch (Fountain) // Fountain->Parker/Pilot/Lamy
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;
				case 1: // Stationary->Pen->Fountain->Parker_Fountain
					Fountain Parker_Fountain1 = new Parker_Fountain();
					Parker_Fountain Pf1 = (Parker_Fountain) Parker_Fountain1;
					System.out.println("You have selected " + Pf1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for IM");
					System.out.println("Press 2 for Vector");
					System.out.println("Press 3 for Jotter");

					int Parker_Fountain = sc.nextInt();

					switch (Parker_Fountain) // Stationary->Pen->Fountain->Parker_Fountain->IM/Vector/Jotter
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->Fountain->Parker_Fountain->IM

						Parker_Fountain IM1 = new IM();
						IM Im1 = (IM) IM1;
						Im1.setPrice(87);
						System.out.println("You have selected " + Im1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Im1.getPrice());
						System.out.println("Brand Name:-" + Im1.brand_name);
						System.out.println("Type:-" + Im1.type);
						break; // Case 1 IM break

					case 2: // Stationary->Pen->Fountain->Parker_Fountain->Vector

						Parker_Fountain Vector1 = new Vector();
						Vector Ve1 = (Vector) Vector1;
						Ve1.setPrice(21);
						System.out.println("You have selected " + Ve1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ve1.getPrice());
						System.out.println("Brand Name:-" + Ve1.brand_name);
						System.out.println("Type:-" + Ve1.type);
						break;// Case 2 Vector break

					case 3: // Stationary->Fountain->Parker_Fountain->Jotter

						Parker_Fountain Jotter1 = new Jotter();
						Jotter Jo1 = (Jotter) Jotter1;
						Jo1.setPrice(35);
						System.out.println("You have selected " + Jo1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Jo1.getPrice());
						System.out.println("Brand Name:-" + Jo1.brand_name);
						System.out.println("Type:-" + Jo1.type);
						break;// Case 3 Jotter break
					}
					break;// Case 1 Parker_Fountain break
				// *********************************************************************************

				case 2: // Stationary->Pen->Fountain->Pilot_Fountain

					Fountain Pilot_Fountain1 = new Pilot_Fountain();
					Pilot_Fountain Pif1 = (Pilot_Fountain) Pilot_Fountain1;
					System.out.println("You have selected " + Pif1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for NamikiFalcon");
					System.out.println("Press 2 for Metropolitan");
					System.out.println("Press 3 for Explorer");

					int Pilot_Fountain = sc.nextInt();

					switch (Pilot_Fountain) // Stationary->Pen->Fountain->Pilot_Fountain->NamikiFalcon/Metropolitan/Explorer
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->Fountain->Pilot_Fountain->NamikiFalcon

						Pilot_Fountain NamikiFalcon1 = new NamikiFalcon();
						NamikiFalcon Nf1 = (NamikiFalcon) NamikiFalcon1;
						Nf1.setPrice(45);
						System.out.println("You have selected " + Nf1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Nf1.getPrice());
						System.out.println("Brand Name:-" + Nf1.brand_name);
						System.out.println("Type:-" + Nf1.type);
						break; // Case 1 NamikiFalcon break

					case 2: // Stationary->Pen->Fountain->Pilot_Fountain->Metropolitan

						Pilot_Fountain Metropolitan1 = new Metropolitan();
						Metropolitan Me1 = (Metropolitan) Metropolitan1;
						Me1.setPrice(56);
						System.out.println("You have selected " + Me1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Me1.getPrice());
						System.out.println("Brand Name:-" + Me1.brand_name);
						System.out.println("Type:-" + Me1.type);
						break; // Case 2 Metropolitan break

					case 3: // Stationary->Pen->Fountain->Pilot_Fountain->Explorer

						Pilot_Fountain Explorer1 = new Explorer();
						Explorer Ex1 = (Explorer) Explorer1;
						Ex1.setPrice(566);
						System.out.println("You have selected " + Ex1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ex1.getPrice());
						System.out.println("Brand Name:-" + Ex1.brand_name);
						System.out.println("Type:-" + Ex1.type);
						break; // Case 3 Explorer break
					}
					break; // Case 2 Pilot_Fountain break

				case 3: // Stationary->Pen->Fountain->Lamy_Fountain

					Fountain Lamy_Fountain1 = new Lamy_Fountain();
					Lamy_Fountain Lf1 = (Lamy_Fountain) Lamy_Fountain1;
					System.out.println("You have selected " + Lf1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Safari");
					System.out.println("Press 2 for Studio");
					System.out.println("Press 3 for Vista");

					int Lamy_Fountain = sc.nextInt();

					switch (Lamy_Fountain) // Stationary->Pen->Fountain->Lamy_Fountain->Safari/Studio/Vista
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pen->Fountain->Lamy_Fountain->Safari

						Lamy_Fountain Safari1 = new Safari();
						Safari Saf1 = (Safari) Safari1;
						Saf1.setPrice(23);
						System.out.println("You have selected " + Saf1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Saf1.getPrice());
						System.out.println("Brand Name:-" + Saf1.brand_name);
						System.out.println("Type:-" + Saf1.type);
						break; // Case 1 Safari break

					case 2: // Stationary->Pen->Fountain->Lamy_Fountain->Studio

						Lamy_Fountain Studio1 = new Studio();
						Studio St1 = (Studio) Studio1;
						St1.setPrice(74);
						System.out.println("You have selected " + St1.name);
						System.out.println("******************");
						System.out.println("Price:-" + St1.getPrice());
						System.out.println("Brand Name:-" + St1.brand_name);
						System.out.println("Type:-" + St1.type);
						break; // Case 2 Studio break

					case 3: // Stationary->Pen->Fountain->Lamy_Fountain->Vista

						Lamy_Fountain Vista1 = new Vista();
						Vista Vis1 = (Vista) Vista1;
						Vis1.setPrice(65);
						System.out.println("You have selected " + Vis1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Vis1.getPrice());
						System.out.println("Brand Name:-" + Vis1.brand_name);
						System.out.println("Type:-" + Vis1.type);
						break; // Case 3 Vista break
					}
					break; // Case 3 Lamy_Fountain break
				}
				break; // Case 3 Fountain break

			}
			break; // Case 1 Pen break

		// START FROM HERE PENCIL REMAINING

		case 2:
			System.out.println("You have selected Pencil");
			System.out.println("******************************");
			Pencil Pencil_1 = new Pencil();
			Pencil_1.write();
			Pencil_1.draw();
			System.out.println("******************************");

			System.out.println("Press 1 for Mechanical");
			System.out.println("Press 2 for Graphite");
			System.out.println("Press 3 for Colored");
			// *********************************************************************************
			int pencil = sc.nextInt();
			switch (pencil) {
			default:
				System.out.println("Please choose Between 1 to 3 numbers only");
				break;
			case 1:

				stationery Mech1 = new Mechanical();
				Mechanical Mechanical1 = (Mechanical) Mech1;
				System.out.println("You have selected " + Mechanical1.type);
				System.out.println("Type of selected pencil is:- " + Mechanical1.type);
				System.out.println("******************");
				System.out.println("Press 1 for Pilot");
				System.out.println("Press 2 for Cello");

				int Mech_Pencil = sc.nextInt();

				switch (Mech_Pencil) // Mechanical->Pilot/Cello_Mechanical/Pentonic
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;
				case 1: // Stationary->Pencil->Mechanical->Pilot

					Mechanical Reynolds1 = new Pilot_Mechanical();
					Pilot_Mechanical Pil_mech1 = (Pilot_Mechanical) Reynolds1;
					System.out.println("You have selected " + Pil_mech1.brand_name);

					System.out.println("***********************************");
					System.out.println("Press 1 for Rexgrip");
					System.out.println("Press 2 for Progrex");
					System.out.println("Press 3 for H_329");

					int Pilot = sc.nextInt();

					switch (Pilot) // Stationary->Pencil->Mechanical->Pilot->Rexgrip/Lumio/H_329
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Mechanical->Pilot->Rexgrip

						Pilot_Mechanical Rexgrip1 = new Rexgrip();
						Rexgrip Rexg1 = (Rexgrip) Rexgrip1;
						Rexg1.setPrice(10);
						System.out.println("You have selected " + Rexg1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Rexg1.getPrice());
						System.out.println("Brand Name:-" + Rexg1.brand_name);
						System.out.println("Type:-" + Rexg1.type);
						break; // Case 1 Rexgrip break

					case 2: // Stationary->Pencil->Mechanical->Pilot->Progrex

						Pilot_Mechanical Progrex1 = new Progrex();
						Progrex prog1 = (Progrex) Progrex1;
						prog1.setPrice(10);
						System.out.println("You have selected " + prog1.name);
						System.out.println("******************");
						System.out.println("Price:-" + prog1.getPrice());
						System.out.println("Brand Name:-" + prog1.brand_name);
						System.out.println("Type:-" + prog1.type);
						break; // Case 2 Progrex break

					case 3: // Stationary->Pencil->Mechanical->Pilot->H_329

						Pilot_Mechanical H_3291 = new H_329();
						H_329 H_329_ = (H_329) H_3291;
						H_329_.setPrice(10);
						System.out.println("You have selected " + H_329_.name);
						System.out.println("******************");
						System.out.println("Price:-" + H_329_.getPrice());
						System.out.println("Brand Name:-" + H_329_.brand_name);
						System.out.println("Type:-" + H_329_.type);
						break; // Case 3 H_329 break
					}
					break; // Case 1 Pilot break
				// *********************************************************************************
				case 2: // Stationary->Pencil->Mechanical->Cello_Mechanical

					Mechanical Cello_Mechanical1 = new Cello_Mechanical();
					Cello_Mechanical Ce_Pit_Pa_C1 = (Cello_Mechanical) Cello_Mechanical1;
					System.out.println("You have selected " + Ce_Pit_Pa_C1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Supreme");
					System.out.println("Press 2 for Smarty Mechanical");
					System.out.println("Press 3 for Axis");

					int Cello_Mechanical = sc.nextInt();

					switch (Cello_Mechanical) // Stationary->Pencil->Mechanical->Cello_Mechanical->Supreme/Smarty/Axis
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Mechanical->Cello_Mechanical->Supreme

						Cello_Mechanical Supreme1 = new Supreme();
						Supreme Sup_mech1 = (Supreme) Supreme1;
						Sup_mech1.setPrice(20);
						System.out.println("You have selected " + Sup_mech1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Sup_mech1.getPrice());
						System.out.println("Brand Name:-" + Sup_mech1.brand_name);
						System.out.println("Type:-" + Sup_mech1.type);
						break;

					case 2: // Stationary->Pencil->Mechanical->Cello_Mechanical->Smarty

						Cello_Mechanical Smarty1 = new Smarty();
						Smarty Smr_Mech1 = (Smarty) Smarty1;
						Smr_Mech1.setPrice(50);
						System.out.println("You have selected " + Smr_Mech1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Smr_Mech1.getPrice());
						System.out.println("Brand Name:-" + Smr_Mech1.brand_name);
						System.out.println("Type:-" + Smr_Mech1.type);
						break;

					case 3: // Stationary->Pencil->Mechanical->Cello_Mechanical->Axis

						Cello_Mechanical Axis1 = new Axis();
						Axis Ax_Mech1 = (Axis) Axis1;
						Ax_Mech1.setPrice(15);
						System.out.println("You have selected " + Ax_Mech1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ax_Mech1.getPrice());
						System.out.println("Brand Name:-" + Ax_Mech1.brand_name);
						System.out.println("Type:-" + Ax_Mech1.type);
						break;
					}
					break;
				// *************************************************

				// *************************************************

				}

				break;
			// *GEL PEN
			// FINISHED*******************************************************************************************************************************

			case 2:

				Pencil Graphite1 = new Graphite();
				Graphite Graph1 = (Graphite) Graphite1;
				System.out.println("You have selected " + Graph1.type);
				System.out.println("Type of selected pencil is:- " + Graph1.type);
				System.out.println("******************");
				System.out.println("Press 1 for HindustanPencil_Graphite");
				System.out.println("Press 2 for DOMS");

				int Graphite = sc.nextInt();

				switch (Graphite) // Graphite->HindustanPencil_Graphite/Cello
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;
				case 1: // Stationary->Pencil->Graphite->HindustanPencil_Graphite
					Graphite HindustanPencil_Graphite1 = new HindustanPencil_Graphite();
					HindustanPencil_Graphite HP_G1 = (HindustanPencil_Graphite) HindustanPencil_Graphite1;

					System.out.println("You have selected " + HP_G1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Apsara");
					System.out.println("Press 2 for Nataraj");

					int HindustanPencil_Graphite = sc.nextInt();

					switch (HindustanPencil_Graphite) // Stationary->Pencil->Graphite->HindustanPencil_Graphite->Apsara/Nataraj
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Graphite->HindustanPencil_Graphite->Apsara

						HindustanPencil_Graphite Apsara1 = new Apsara();
						Apsara Ap_G1 = (Apsara) Apsara1;
						Ap_G1.setPrice(60);
						System.out.println("You have selected " + Ap_G1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Ap_G1.getPrice());
						System.out.println("Brand Name:-" + Ap_G1.brand_name);
						System.out.println("Type:-" + Ap_G1.type);
						break;

					case 2: // Stationary->Pencil->Graphite->HindustanPencil_Graphite->Nataraj

						HindustanPencil_Graphite Nataraj1 = new Nataraj();
						Nataraj Na_G1 = (Nataraj) Nataraj1;
						Na_G1.setPrice(30);
						System.out.println("You have selected " + Na_G1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Na_G1.getPrice());
						System.out.println("Brand Name:-" + Na_G1.brand_name);
						System.out.println("Type:-" + Na_G1.type);
						break;

					}
					break;
				// *********************************************************************************

				case 2: // Stationary->Pencil->Graphite->DOMS_Graphite

					Graphite DOMS_Graphite1 = new DOMS_Graphite();
					DOMS_Graphite D_G1 = (DOMS_Graphite) DOMS_Graphite1;
					System.out.println("You have selected " + D_G1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Groove");
					System.out.println("Press 2 for Fusion Graphite");
					System.out.println("Press 3 for ZoomTriangle");

					int DOMS_Graphite = sc.nextInt();

					switch (DOMS_Graphite) // Stationary->Pencil->Graphite->DOMS_Graphite->Groove/Fusion/Axis
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Graphite->DOMS_Graphite->Groove

						DOMS_Graphite Groove1 = new Groove();
						Groove Gr_G1 = (Groove) Groove1;
						Gr_G1.setPrice(36);
						System.out.println("You have selected " + Gr_G1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Gr_G1.getPrice());
						System.out.println("Brand Name:-" + Gr_G1.brand_name);
						System.out.println("Type:-" + Gr_G1.type);
						break;

					case 2: // Stationary->Pencil->Graphite->DOMS_Graphite->Fusion

						DOMS_Graphite Fusion1 = new Fusion();
						Fusion Fus_G1 = (Fusion) Fusion1;
						Fus_G1.setPrice(31);
						System.out.println("You have selected " + Fus_G1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Fus_G1.getPrice());
						System.out.println("Brand Name:-" + Fus_G1.brand_name);
						System.out.println("Type:-" + Fus_G1.type);
						break;

					case 3: // Stationary->Pencil->Graphite->DOMS_Graphite->ZoomTriangle

						DOMS_Graphite ZoomTriangle1 = new ZoomTriangle();
						ZoomTriangle ZoomT_G1 = (ZoomTriangle) ZoomTriangle1;
						ZoomT_G1.setPrice(26);
						System.out.println("You have selected " + ZoomT_G1.name);
						System.out.println("******************");
						System.out.println("Price:-" + ZoomT_G1.getPrice());
						System.out.println("Brand Name:-" + ZoomT_G1.brand_name);
						System.out.println("Type:-" + ZoomT_G1.type);
						break;
					}
					break;

				}
				break;
			// till Graphite finished

			case 3:

				Pencil Colored1 = new Colored();
				Colored Col1 = (Colored) Colored1;
				System.out.println("You have selected " + Col1.type);
				System.out.println("Type of selected pencil is:- " + Col1.type);
				System.out.println("******************");
				System.out.println("Press 1 for DOMS_Colored");
				System.out.println("Press 2 for Fiber-Castle");

				int Colored = sc.nextInt();

				switch (Colored) // Colored->DOMS_Colored/Pilot/Lamy
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;
				case 1: // Stationary->Pencil->Colored->DOMS_Colored
					Colored DOMS_Colored1 = new DOMS_Colored();
					DOMS_Colored DOMS_C1 = (DOMS_Colored) DOMS_Colored1;
					System.out.println("You have selected " + DOMS_C1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for GrooveColor");
					System.out.println("Press 2 for MegaTriangle");

					int DOMS_Colored = sc.nextInt();

					switch (DOMS_Colored) // Stationary->Pencil->Colored->DOMS_Colored->GrooveColor/MegaTriangle/Jotter
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Colored->DOMS_Colored->GrooveColor

						DOMS_Colored IM1 = new GrooveColor();
						GrooveColor Gro_C1 = (GrooveColor) IM1;
						Gro_C1.setPrice(87);
						System.out.println("You have selected " + Gro_C1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Gro_C1.getPrice());
						System.out.println("Brand Name:-" + Gro_C1.brand_name);
						System.out.println("Type:-" + Gro_C1.type);
						break;// Case 1 DOMS_Colored->GrooveColor

					case 2: // Stationary->Pencil->Colored->DOMS_Colored->MegaTriangle

						DOMS_Colored MegaTriangle1 = new MegaTriangle();
						MegaTriangle Me_Tri1 = (MegaTriangle) MegaTriangle1;
						Me_Tri1.setPrice(21);
						System.out.println("You have selected " + Me_Tri1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Me_Tri1.getPrice());
						System.out.println("Brand Name:-" + Me_Tri1.brand_name);
						System.out.println("Type:-" + Me_Tri1.type);
						break;// case2 DOMS_Colored->MegaTriangle

					}
					break; // case 1 DOMS_Colored
				// *********************************************************************************

				case 2: // Stationary->Pencil->Colored->FiberCastle_Colored

					Colored FiberCastle_Colored1 = new FiberCastle_Colored();
					FiberCastle_Colored Fib_Cas1 = (FiberCastle_Colored) FiberCastle_Colored1;
					System.out.println("You have selected " + Fib_Cas1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Polychromos");
					System.out.println("Press 2 for PittPastle");

					int FiberCastle_Colored = sc.nextInt();

					switch (FiberCastle_Colored) // Stationary->Pencil->Colored->FiberCastle_Colored->Polychromos/PittPastle/Explorer
					{
					default:
						System.out.println("Please choose Between 1 to 3 numbers only");
						break;
					case 1: // Stationary->Pencil->Colored->FiberCastle_Colored->Polychromos

						FiberCastle_Colored Polychromos1 = new Polychromos();
						Polychromos Pol_C1 = (Polychromos) Polychromos1;
						Pol_C1.setPrice(45);
						System.out.println("You have selected " + Pol_C1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Pol_C1.getPrice());
						System.out.println("Brand Name:-" + Pol_C1.brand_name);
						System.out.println("Type:-" + Pol_C1.type);
						break;// case 1 FiberCastle_Colored->Polychromos

					case 2: // Stationary->Pencil->Colored->FiberCastle_Colored->PittPastle

						FiberCastle_Colored PittPastle1 = new PittPastle();
						PittPastle Pit_Pa_C1 = (PittPastle) PittPastle1;
						Pit_Pa_C1.setPrice(56);
						System.out.println("You have selected " + Pit_Pa_C1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Pit_Pa_C1.getPrice());
						System.out.println("Brand Name:-" + Pit_Pa_C1.brand_name);
						System.out.println("Type:-" + Pit_Pa_C1.type);
						break; // Case 2 PittPastle break

					}
					break; // Case 2 FiberCastle_Colored break

				}
				break; // Case 3 Colored break
			}

			break;

		case 3:
			System.out.println("You have selected Marker");
			System.out.println("******************************");
			Marker Marker_1 = new Marker();
			Marker_1.write();
			Marker_1.draw();
			Marker_1.capOpen();
			Marker_1.capClose();
			System.out.println("******************************");

			System.out.println("Press 1 for Permanent");
			System.out.println("Press 2 for Whiteboard");
			// *********************************************************************************
			int marker = sc.nextInt();
			switch (marker) {
			default:
				System.out.println("Please choose Between 1 to 2 numbers only");
				break;
			case 1:

				stationery Per_Mar_1 = new Permanent();
				Permanent Permanent_M_1 = (Permanent) Per_Mar_1;
				System.out.println("You have selected " + Permanent_M_1.type);
				System.out.println("Type of selected Marker is:- " + Permanent_M_1.type);
				System.out.println("******************");
				System.out.println("Press 1 for Reynolds");
				System.out.println("Press 2 for Cello");

				int Reynolds_Perm = sc.nextInt();

				switch (Reynolds_Perm) // Permanent->Reynolds_Permanent/Cello_Permanent
				{
				default:
					System.out.println("Please choose Between 1 to 2 numbers only");
					break;

				case 1: // Stationary->Marker->Permanent->Reynolds_Permanent

					Permanent Rey_Perm_1 = new Reynolds_Permanent();
					Reynolds_Permanent Rey_Perm1 = (Reynolds_Permanent) Rey_Perm_1;
					System.out.println("You have selected " + Rey_Perm1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for HD_Permanent");
					System.out.println("Press 2 for Basic_Permanent");

					int Rey_Perm = sc.nextInt();
					switch (Rey_Perm) // Stationary->Marker->Permanent->Reynolds_Permanent->HD_Permanent/Basic_Permanent
					{
					default:
						System.out.println("Please choose Between 1 to 2 numbers only");
						break;
					case 1: // Stationary->Marker->Permanent->Reynolds_Permanent->HD_Permanent

						Reynolds_Permanent HD_P_1 = new HD_Permanent();
						HD_Permanent HD_P1 = (HD_Permanent) HD_P_1;
						HD_P1.setPrice(10);
						System.out.println("You have selected " + HD_P1.name);
						System.out.println("******************");
						System.out.println("Price:-" + HD_P1.getPrice());
						System.out.println("Brand Name:-" + HD_P1.brand_name);
						System.out.println("Type:-" + HD_P1.type);
						break; // Case 1 HD_Permanent break

					case 2: // Stationary->Marker->Permanent->Reynolds_Permanent->Basic_Permanent

						Reynolds_Permanent BA_P_1 = new Basic_Permanent();
						Basic_Permanent BA_P1 = (Basic_Permanent) BA_P_1;
						BA_P1.setPrice(10);
						System.out.println("You have selected " + BA_P1.name);
						System.out.println("******************");
						System.out.println("Price:-" + BA_P1.getPrice());
						System.out.println("Brand Name:-" + BA_P1.brand_name);
						System.out.println("Type:-" + BA_P1.type);
						break; // Case 2 Basic_Permanent break

					}
					break; // Case 1 Reynolds_Permanent break

				case 2:// Stationary->Marker->Permanent->Cello_Permanent
					Permanent Cello_Perm_1 = new Cello_Permanent();
					Cello_Permanent Cello_Perm1 = (Cello_Permanent) Cello_Perm_1;
					System.out.println("You have selected " + Cello_Perm1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Marky");
					System.out.println("Press 2 for Permaline");

					int Cello_Permanent2 = sc.nextInt();

					switch (Cello_Permanent2) // Stationary->Marker->Permanent->Cello_Permanent->Marky_Permanent/Permaline_Permanent
					{
					default:
						System.out.println("Please choose Between 1 to 2 numbers only");
						break;
					case 1: // Stationary->Marker->Permanent->Cello_Permanent->Marky_Permanent

						Cello_Permanent Marky_Perm_1 = new Marky_Permanent();
						Marky_Permanent Marky_Perm1 = (Marky_Permanent) Marky_Perm_1;
						Marky_Perm1.setPrice(28);
						System.out.println("You have selected " + Marky_Perm1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Marky_Perm1.getPrice());
						System.out.println("Brand Name:-" + Marky_Perm1.brand_name);
						System.out.println("Type:-" + Marky_Perm1.type);
						break;// Case 1 Marky_Permanent break

					case 2: // Stationary->Marker->Permanent->Cello_Permanent->Permaline_Permanent

						Cello_Permanent Permaline_Perm_1 = new Permaline_Permanent();
						Permaline_Permanent Permaline_Perm1 = (Permaline_Permanent) Permaline_Perm_1;
						Permaline_Perm1.setPrice(50);
						System.out.println("You have selected " + Permaline_Perm1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Permaline_Perm1.getPrice());
						System.out.println("Brand Name:-" + Permaline_Perm1.brand_name);
						System.out.println("Type:-" + Permaline_Perm1.type);
						break; // case 2 Cello_Permanent->Permaline_Permanent

					}
					break; // case 2 Cello_Permanent

				}
				break;// case 1 Permanent

			case 2:// Stationary->Marker->WhiteBoard->
				stationery Whi_Mar_1 = new Reynolds_WhiteBoard();
				WhiteBoard WhiteBoard_M_1 = (WhiteBoard) Whi_Mar_1;
				System.out.println("You have selected " + WhiteBoard_M_1.type);

				System.out.println("******************");
				System.out.println("Press 1 for Reynolds_WhiteBoard");
				System.out.println("Press 2 for Camlin_WhiteBoard");
				System.out.println("Press 3 for Cello_WhiteBoard");

				int Rey_White = sc.nextInt();

				switch (Rey_White) // WhiteBoard->Reynolds_WhiteBoard/Camlin_WhiteBoard/Cello_WhiteBoard
				{
				default:
					System.out.println("Please choose Between 1 to 3 numbers only");
					break;

				case 1: // Stationary->Marker->WhiteBoard->Reynolds_WhiteBoard

					WhiteBoard Rey_White_1 = new Reynolds_WhiteBoard();
					Reynolds_WhiteBoard Rey_White1 = (Reynolds_WhiteBoard) Rey_White_1;
					System.out.println("You have selected " + Rey_White1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for HD_WhiteBoard");
					System.out.println("Press 2 for Basic_WhiteBoard");

					int Rey_Wh = sc.nextInt();
					switch (Rey_Wh) // Stationary->Marker->WhiteBoard->Reynolds_WhiteBoard->HD_WhiteBoard/Basic_WhiteBoard
					{
					default:
						System.out.println("Please choose Between 1 to 2 numbers only");
						break;
					case 1: // Stationary->Marker->Permanent->Reynolds_WhiteBoard->HD_WhiteBoard

						Reynolds_WhiteBoard HD_W_1 = new HD_WhiteBoard();
						HD_WhiteBoard HD_W1 = (HD_WhiteBoard) HD_W_1;
						HD_W1.setPrice(10);
						System.out.println("You have selected " + HD_W1.name);
						System.out.println("******************");
						System.out.println("Price:-" + HD_W1.getPrice());
						System.out.println("Brand Name:-" + HD_W1.brand_name);
						System.out.println("Type:-" + HD_W1.type);
						break; // Case 1 HD_WhiteBoard break

					case 2: // Stationary->Marker->WhiteBoard->Reynolds_WhiteBoard->Basic_WhiteBoard

						Reynolds_WhiteBoard BA_W_1 = new Basic_WhiteBoard();
						Basic_WhiteBoard BA_W1 = (Basic_WhiteBoard) BA_W_1;
						BA_W1.setPrice(10);
						System.out.println("You have selected " + BA_W1.name);
						System.out.println("******************");
						System.out.println("Price:-" + BA_W1.getPrice());
						System.out.println("Brand Name:-" + BA_W1.brand_name);
						System.out.println("Type:-" + BA_W1.type);
						break; // Case 2 Basic_WhiteBoard break

					}
					break; // Case 1 Reynolds_WhiteBoard break

				case 2:// Stationary->Marker->WhiteBoard->Camlin_WhiteBoard
					WhiteBoard Camlin_Whit_1 = new Camlin_WhiteBoard();
					Camlin_WhiteBoard Camlin_Whit1 = (Camlin_WhiteBoard) Camlin_Whit_1;
					System.out.println("You have selected " + Camlin_Whit1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for CamlinPB");
					System.out.println("Press 2 for Bold_e");

					int Camlin_WhiteBoard2 = sc.nextInt();

					switch (Camlin_WhiteBoard2) // Stationary->Marker->WhiteBoard->Camlin_WhiteBoard->CamlinPB/Bold_e
					{
					default:
						System.out.println("Please choose Between 1 to 2 numbers only");
						break;
					case 1: // Stationary->Marker->WhiteBoard->Cello_WhiteBoard->CamlinPB

						Camlin_WhiteBoard CamlinPB_Whit_1 = new CamlinPB();
						CamlinPB CamlinPB_Whit1 = (CamlinPB) CamlinPB_Whit_1;
						CamlinPB_Whit1.setPrice(20);
						System.out.println("You have selected " + CamlinPB_Whit1.name);
						System.out.println("******************");
						System.out.println("Price:-" + CamlinPB_Whit1.getPrice());
						System.out.println("Brand Name:-" + CamlinPB_Whit1.brand_name);
						System.out.println("Type:-" + CamlinPB_Whit1.type);
						break;// case 1 Camlin_WhiteBoard->CamlinPB

					case 2: // Stationary->Marker->WhiteBoard->Camlin_WhiteBoard->Bold_e

						Camlin_WhiteBoard Bold_e_Perm_1 = new Bold_e();
						Bold_e Bold_e_Perm1 = (Bold_e) Bold_e_Perm_1;
						Bold_e_Perm1.setPrice(50);
						System.out.println("You have selected " + Bold_e_Perm1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Bold_e_Perm1.getPrice());
						System.out.println("Brand Name:-" + Bold_e_Perm1.brand_name);
						System.out.println("Type:-" + Bold_e_Perm1.type);
						break; // case 2 Camlin_WhiteBoard->Bold_e

					}
					break; // case 3 Cello_WhiteBoard

				case 3:// Stationary->Marker->WhiteBoard->Cello_WhiteBoard
					WhiteBoard Cello_Whit_1 = new Cello_WhiteBoard();
					Cello_WhiteBoard Cello_White1 = (Cello_WhiteBoard) Cello_Whit_1;
					System.out.println("You have selected " + Cello_White1.brand_name);

					System.out.println("******************");
					System.out.println("Press 1 for Whitemate");
					System.out.println("Press 2 for Vivid");

					int Cello_WhiteBoard2 = sc.nextInt();

					switch (Cello_WhiteBoard2) // Stationary->Marker->WhiteBoard->Cello_WhiteBoard->Whitemate/Vivid
					{
					default:
						System.out.println("Please choose Between 1 to 2 numbers only");
						break;
					case 1: // Stationary->Marker->WhiteBoard->Cello_WhiteBoard->Whitemate

						Cello_WhiteBoard Whitemate_Whit_1 = new Whitemate();
						Whitemate Whitemate_Whit1 = (Whitemate) Whitemate_Whit_1;
						Whitemate_Whit1.setPrice(20);
						System.out.println("You have selected " + Whitemate_Whit1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Whitemate_Whit1.getPrice());
						System.out.println("Brand Name:-" + Whitemate_Whit1.brand_name);
						System.out.println("Type:-" + Whitemate_Whit1.type);
						break;// case 1 Cello_WhiteBoard->Whitemate

					case 2: // Stationary->Marker->WhiteBoard->Cello_WhiteBoard->Vivid

						Cello_WhiteBoard Vivid_Perm_1 = new Vivid();
						Vivid Vivid_Perm1 = (Vivid) Vivid_Perm_1;
						Vivid_Perm1.setPrice(50);
						System.out.println("You have selected " + Vivid_Perm1.name);
						System.out.println("******************");
						System.out.println("Price:-" + Vivid_Perm1.getPrice());
						System.out.println("Brand Name:-" + Vivid_Perm1.brand_name);
						System.out.println("Type:-" + Vivid_Perm1.type);
						break; // case 2 Cello_WhiteBoard->Vivid

					}
					break; // case 3 Cello_WhiteBoard
				}
				break;// case 2 WhiteBoard

			}
			break; // case 3 Marker

		}
	}
}
