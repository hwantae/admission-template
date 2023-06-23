import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ApplicationForm extends JFrame {

	private JPanel contentPane;
	private JLabel pictureSKKU;
	private JLabel logoSKKU;
	private JLabel applicantNameLabel;
	private JTextField applicantNameTextBox;
	private JTextField birthDateTextBox;
	private JTextField emailTextBox;
	private JTextField degreeTextBox;
	private JTextField universityTextBox;
	private JTextField gpaTextBox;
	private JTextField homeAddressTextBox;
	private JButton btnNewButton;
	private JLabel birthDateLabel;
	private JLabel emailLabel;
	private JLabel degreeLabel;
	private JLabel gpaLabel;
	private JLabel homeAddressLabel;
	private JLabel personalStatementLabel;
	private boolean nameError = false;
	private boolean birthdayError = false;
	private boolean emailError = false;
	private boolean degreeError = false;
	private boolean graduateStudentError = false;
	private boolean graduateStudentGpaError = false;
	private boolean addressError = false;
	private boolean isBachelor = false;
	private boolean isPhD = false;
	private JTextField phoneNumberTextBox;
	private JLabel lblPhoneNumber;
	private boolean degreeEmpty = false;
	private boolean phoneNumberError =false;
	private JTextField majorTextBox;
	private JLabel lblMajor;
	private boolean majorError =false;
	private JLabel sloganLabel1;
	private JTextArea stateTextArea;
	private JLabel sloganLabel2;
	private boolean letterNumError =false;
	private JLabel universityLabel;
	private boolean bachelorError =false;
	private boolean stateError =false;
	private JLabel skkuCharacter2;
	private JLabel skkuCharacter1;
	private JTextField graduationTextBox;
	private JLabel graduationLabel;
	private boolean graduationError = false;
	private boolean gpaBoundaryError =false;
	
	
	//this function gives state of graduateStudentGpaError.
	public boolean isGraduateStudentGpaError() {
		return graduateStudentGpaError;
	}
	//this function enables user to set the state of graduateStudentGpaError.
	public void setGraduateStudentGpaError(boolean graduateStudentGpaError) {
		this.graduateStudentGpaError = graduateStudentGpaError;
	}
	//this function gives state of graduateStudentError
	public boolean isGraduateStudentError() {
		return graduateStudentError;
	}
	//this function enables user to set the state of graduateStudentError
	public void setGraduateStudentError(boolean graduateStudentError) {
		this.graduateStudentError = graduateStudentError;
	}
	//this function gives state of gpaBoundaryError
	public boolean isGpaBoundaryError() {
		return gpaBoundaryError;
	}
	//this function enables user to set the state of gpaBoundaryError
	public void setGpaBoundaryError(boolean gpaBoundaryError) {
		this.gpaBoundaryError = gpaBoundaryError;
	}
	//this function gives state of gpaBoundaryError;
	public boolean isGraduationError() {
		return graduationError;
	}
	//this function enables user to set the state of graduationError
	public void setGraduationError(boolean graduationError) {
		this.graduationError = graduationError;
	}
	//this function gives state of stateError
	public boolean isStateError() {
		return stateError;
	}
	//this function enables user to set the state of stateError
	public void setStateError(boolean stateError) {
		this.stateError = stateError;
	}
	//this function gives state of bachelorError
	public boolean isBachelorError() {
		return bachelorError;
	}
	//this function enables user to set the state of bachelorError
	public void setBachelorError(boolean bachelorError) {
		this.bachelorError = bachelorError;
	}
	//this function gives state of letterNumError
	public boolean isLetterNumError() {
		return letterNumError;
	}
	//this function enables user to set the state of letterNumError
	public void setLetterNumError(boolean letterNumError) {
		this.letterNumError = letterNumError;
	}
	//this function gives state of majorError
	public boolean isMajorError() {
		return majorError;
	}
	//this function enables user to set the state of majorError
	public void setMajorError(boolean majorError) {
		this.majorError = majorError;
	}
	//this function gives state of phoneNumberError
	public boolean isPhoneNumberError() {
		return phoneNumberError;
	}
	//this function enables user to set the state of phoneNumberError
	public void setPhoneNumberError(boolean phoneNumberError) {
		this.phoneNumberError = phoneNumberError;
	}

	//this function gives state of degreeEmpty
	public boolean isDegreeEmpty() {
		return degreeEmpty;
	}
	//this function enables user to set the state of degreeEmpty
	public void setDegreeEmpty(boolean degreeEmpty) {
		this.degreeEmpty = degreeEmpty;
	}
	//this function gives state of nameError
	public boolean isNameError() {
		return nameError;
	}
	//this function enables user to set the state of nameError
	public void setNameError(boolean nameError) {
		this.nameError = nameError;
	}
	//this function gives state of birthdayError
	public boolean isBirthdayError() {
		return birthdayError;
	}
	//this function enables user to set the state of birthdayError
	public void setBirthdayError(boolean birthdayError) {
		this.birthdayError = birthdayError;
	}
	//this function gives state of emailError
	public boolean isEmailError() {
		return emailError;
	}
	//this function enables user to set the state of emailError
	public void setEmailError(boolean emailError) {
		this.emailError = emailError;
	}
	//this function gives state of degreeError
	public boolean isDegreeError() {
		return degreeError;
	}
	//this function enables user to set the state of degreeError
	public void setDegreeError(boolean degreeError) {
		this.degreeError = degreeError;
	}
	//this function gives state of addressError
	public boolean isAddressError() {
		return addressError;
	}
	//this function enables user to set the state of addressError
	public void setAddressError(boolean addressError) {
		this.addressError = addressError;
	}
	//this function gives state of isBachelor
	public boolean isBachelor() {
		return isBachelor;
	}
	//this function enables user to set the state of isBachelor
	public void setBachelor(boolean isBachelor) {
		this.isBachelor = isBachelor;
	}
	//this function gives state of isPhD
	public boolean isPhD() {
		return isPhD;
	}
	//this function enables user to set the state of isPhD
	public void setPhD(boolean isPhD) {
		this.isPhD = isPhD;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm frame = new ApplicationForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApplicationForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 630);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pictureSKKU = new JLabel("");
		pictureSKKU.setBounds(12, 10, 268, 532);
		pictureSKKU.setIcon(new ImageIcon(ApplicationForm.class.getResource("/img/skku_wallpaper.png")));
		contentPane.add(pictureSKKU);
		
		logoSKKU = new JLabel("");
		logoSKKU.setIcon(new ImageIcon(ApplicationForm.class.getResource("/img/title_label.png")));
		logoSKKU.setBounds(299, 10, 470, 67);
		contentPane.add(logoSKKU);
		
		applicantNameLabel = new JLabel("Applicant Name:");
		applicantNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		applicantNameLabel.setBounds(398, 98, 100, 15);
		contentPane.add(applicantNameLabel);
		
		applicantNameTextBox = new JTextField();
		applicantNameTextBox.setBounds(501, 95, 268, 20);
		contentPane.add(applicantNameTextBox);
		applicantNameTextBox.setColumns(10);
		
		birthDateTextBox = new JTextField();
		birthDateTextBox.setColumns(10);
		birthDateTextBox.setBounds(501, 133, 268, 20);
		contentPane.add(birthDateTextBox);
		
		emailTextBox = new JTextField();
		emailTextBox.setColumns(10);
		emailTextBox.setBounds(501, 171, 268, 20);
		contentPane.add(emailTextBox);
		
		degreeTextBox = new JTextField();
		degreeTextBox.setColumns(10);
		degreeTextBox.setBounds(501, 207, 268, 20);
		contentPane.add(degreeTextBox);
		
		universityTextBox = new JTextField();
		universityTextBox.setColumns(10);
		universityTextBox.setBounds(501, 242, 268, 20);
		contentPane.add(universityTextBox);
		
		gpaTextBox = new JTextField();
		gpaTextBox.setColumns(10);
		gpaTextBox.setBounds(501, 282, 268, 20);
		contentPane.add(gpaTextBox);
		
		homeAddressTextBox = new JTextField();
		homeAddressTextBox.setColumns(10);
		homeAddressTextBox.setBounds(501, 522, 268, 20);
		contentPane.add(homeAddressTextBox);
		
		btnNewButton = new JButton("Submit Application");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String applicantName = applicantNameTextBox.getText();		//extract text from applicantNameTextBox and initializes applicantName
				String birthday = birthDateTextBox.getText();		//extract text from birthDateTextBox and initializes birthday
				String emailAdd = emailTextBox.getText();		//extract text from emailTextBox and initializes emailAdd
				String degree = degreeTextBox.getText();		//extract text from degreeTextBox and initializes degree
				String attendedUniv = universityTextBox.getText();		//extract text from universityTextBox and initializes attendedUniv
				String gpa = gpaTextBox.getText();		//extract text from gpaTextBox and initializes gpa
				String personalState = stateTextArea.getText();		//extract text from stateTextArea and initializes personalState
				String homeAdd = homeAddressTextBox.getText();		//extract text from homeAddressTextBox and initializes homeAdd
				String phoneNumber = phoneNumberTextBox.getText();		//extract text from phoneNumberTextBox and initializes phoneNumber
				String major = majorTextBox.getText();		//extract text from majorTextBox and initializes major
				String statement = stateTextArea.getText();		//extract text from stateTextArea and initializes statement
				String graduationYear = graduationTextBox.getText();		//extract text from graduationTextBox and initializes graduationYear
				setDegreeEmpty(false);
				setNameError(false);
				setBirthdayError(false);
				setEmailError(false);
				setDegreeError(false);
				
				setAddressError(false);
				setBachelor(false);
				setPhD(false);
				setPhoneNumberError(false);
				setMajorError(false);
				setBachelorError(false);
				setStateError(false);
				setGraduationError(false);
				setGpaBoundaryError(false);
				setGraduateStudentError(false);
				setGraduateStudentGpaError(false);
				//this if statement sets the value of PhD, Bachelor and DegreeEmpty regarding the value of degree.
				if (degree.equals("Bachelor")) {
					setPhD(false);
					setBachelor(true);
					setDegreeEmpty(false);
				}
				else if (degree.equals("PhD")) {
					setPhD(true);
					setBachelor(false);
					setDegreeEmpty(false);
				}
				else if (degree.equals("")){
					setDegreeEmpty(true);
					setBachelor(false);
					setPhD(false);
				}
				String[] nameVar = applicantName.split(" "); //split the applicantName by space and put them in nameVar
				String[] birthdayVar = birthday.split("/");//split the birthday by / and put them in birthdayVar
				String[] emailVar1 = emailAdd.split("@"); //split the emailAdd by @ and put them in emailVar1
				String[] emailVar2 = emailAdd.split("[.]");//split the emailAdd by . and put them in emailVar2
				String[] addressVar = homeAdd.split(",");//split the addressVar by , and put them in addressVar
				String[] phoneNumVar = phoneNumber.split("-");//split the phoneNumber by - and put them in phoneNumVar
				int birthdayVarLength = birthdayVar.length; //get the length of birthdayVar and put it to birthdayVarLength.
				int phoneNumVarLength = phoneNumVar.length; //initializes phoneNumVarLength with length of phoneNumVar.
				int admissionYear;

				//Those if statement set the boolean flags, which indicate each error, with their conditions
				if((isBachelor()&&!graduationYear.equals(""))&&!isDegreeEmpty()) {
					setGraduationError(true);
				}
				if (nameVar.length == 0 || nameVar.length == 1) {
					setNameError(true);
				}
				if (birthdayVar.length == 0 || birthdayVar.length == 1 || birthdayVar.length == 2) {
					setBirthdayError(true);
				}
				if (emailVar1.length != 2 || emailVar2.length != 2) {
					setEmailError(true);
				}
				if (isPhD()&&attendedUniv.isBlank()) {
					setGraduateStudentError(true);
				}
				if (isPhD()&&gpa.isBlank()) {
					setGraduateStudentGpaError(true);
				}
				if (isPhD()&&graduationYear.isBlank()) {
					setGraduationError(true);
				}
				if (isBachelor()&& !attendedUniv.isBlank()) {
					setBachelorError(true);
				}
				if (isBachelor()&& !gpa.isBlank()) {
					setBachelorError(true);
				}
				if (isBachelor()&&!graduationYear.isBlank()) {
					setBachelorError(true);
				}
				if (!isBachelor()&&!isPhD()) {
					setDegreeError(true);
				}
				if (addressVar.length != 4) {
					setAddressError(true);
				}
				if (phoneNumVar.length != 3 || !phoneNumVar[0].equals("010") || phoneNumVar[1].length()<4 || phoneNumVar[2].length()<4) {
					setPhoneNumberError(true);
				}
				if (major.equals("")) {
					setMajorError(true);
				}
				if(statement.length()<100) {
					setStateError(true);
				}
				//those variables are created for check NumberFormatException
				double gpaDouble = 0;
				int graduationInt = 0;
				int phoneInt = 0;
				int birthdayInt = 0;
				try {
					//those if statement checks whether array of string has variables, and if there is variable, try to change string to int type.
					if (!phoneNumber.isBlank()) {
						for (int i =0;i<phoneNumVarLength;i++) {
							phoneInt = Integer.parseInt(phoneNumVar[i]);
						}	
					}
					if (!birthday.isBlank()) {
						for (int i =0;i<birthdayVarLength;i++) {
							phoneInt = Integer.parseInt(birthdayVar[i]);
						}	
					}
					if (!isBachelor()&&(!gpa.isBlank() || !graduationYear.isBlank())) {
						gpaDouble = Double.parseDouble(gpa);
						graduationInt = Integer.parseInt(graduationYear);
					}
					//this if statement checks whether gpaDouble is between 0 and 4.5
					if (gpaDouble < 0 || gpaDouble > 4.5) {
						setGpaBoundaryError(true);
					}
					//this if statement checks if there is error among all of the error.
					if (isDegreeError()||isGraduateStudentGpaError()||isGraduateStudentError()||isNameError()||isBirthdayError()||isEmailError()||isAddressError()||isPhoneNumberError()||isMajorError()||isBachelorError()||isStateError()||isGraduationError()||isGpaBoundaryError()) {
						throw new FormatException();
					}
				} catch(FormatException e1) {
					String errorMessage = "";		//error messages are added when each error is true;
					int number = 1;
					graduationTextBox.setForeground(Color.black);
					// those if statements check each error flag. If the an error flag is true, error message for the error is added to errorMessage, and changes font color to red.
					if (isNameError()) {
						errorMessage = errorMessage + number + ". You forgot to write your name or surname.\n";
						applicantNameTextBox.setForeground(Color.red);
						number++;
					}
					if (isBirthdayError()) {
						errorMessage = errorMessage + number + ". Birth date must be in 'year/month/day' format.\n";
						birthDateTextBox.setForeground(Color.red);
						number++;
					}
					if (isEmailError()) {
						errorMessage = errorMessage + number + ". Email must be in example@some.some\n";
						emailTextBox.setForeground(Color.red);
						number++;
					}
					if (isGraduateStudentError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter previous university.\n";
						universityTextBox.setForeground(Color.red);
						number++;
					}
					if (isGraduateStudentGpaError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter GPA.\n";
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isGpaBoundaryError()) {
						errorMessage = errorMessage + number + ". GPA must be between 0 and 4.5.\n";
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isBachelorError()) {
						errorMessage = errorMessage + number + ". For undergraduates, you do not have to enter previous university, GPA and graduation year.\n";
						universityTextBox.setForeground(Color.red);
						gpaTextBox.setForeground(Color.red);
						graduationTextBox.setForeground(Color.red);
						number++;
					}
					if (isDegreeError()) {
						errorMessage = errorMessage + number + ". You should write your degree.\n";
						degreeTextBox.setForeground(Color.red);
						universityTextBox.setForeground(Color.red);
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isPhoneNumberError()) {
						errorMessage = errorMessage + number + ". Your phone number should be in '010-XXXX-XXXX' format.\n";
						phoneNumberTextBox.setForeground(Color.red);
						number++;
					}
					if (isMajorError()) {
						errorMessage = errorMessage + number + ". You should write your major.\n";
						majorTextBox.setForeground(Color.red);
						number++;
					}
					if(isStateError()) {
						errorMessage = errorMessage + number + ". You should write your statement more than 100 letters.\n";
						stateTextArea.setForeground(Color.red);
						number++;
					}
					if(isGraduationError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter graduation year.\n";
						graduationTextBox.setForeground(Color.red);
						number++;
					}
					if (isAddressError()) {
						errorMessage = errorMessage + number + ". Your address must be in 'number, street, district, city' format.\n";
						homeAddressTextBox.setForeground(Color.red);
						number++;
					}
					//those if statement checks whether error flag is false. If error flag is false, changes the font color to black.
					if (!isNameError()) {
						applicantNameTextBox.setForeground(Color.black);
					}
					if (!isBirthdayError()) {
						birthDateTextBox.setForeground(Color.black);
					}
					if (!isEmailError()) {
						emailTextBox.setForeground(Color.black);
					}
					if (!isAddressError()) {
						homeAddressTextBox.setForeground(Color.black);
					}
					if (!isPhoneNumberError()) {
						phoneNumberTextBox.setForeground(Color.black);
					}
					if (!isMajorError()) {
						majorTextBox.setForeground(Color.black);
					}
					if(!isStateError()) {
						stateTextArea.setForeground(Color.black);
					}
					if(!isGraduationError()) {
						graduationTextBox.setForeground(Color.black);
					}
					if(!isGpaBoundaryError()&&!isGraduateStudentGpaError()) {
						gpaTextBox.setForeground(Color.black);
					}
					if (!isGraduateStudentError()) {
						universityTextBox.setForeground(Color.black);
					}
					if (!isDegreeError()) {
						degreeTextBox.setForeground(Color.black);
					}
					if (!isBachelorError()&&!isDegreeError()) {
						universityTextBox.setForeground(Color.black);
						gpaTextBox.setForeground(Color.black);
						graduationTextBox.setForeground(Color.black);
					}
					
					JOptionPane.showMessageDialog(null, errorMessage, "Error Message", JOptionPane.ERROR_MESSAGE);
				} catch (NumberFormatException e2) {
					String errorMessage = "";
					int number = 1;
					//if NumberFormatException is caught, it means string is entered to place where integer or double should be entered.
					//so text boxes where number should be placed change color of font to red
					errorMessage = errorMessage + number + ". You should write number in birthday, phone number, GPA and Graduation Year.\n";
					number++;
					birthDateTextBox.setForeground(Color.red);
					phoneNumberTextBox.setForeground(Color.red);
					graduationTextBox.setForeground(Color.red);
					gpaTextBox.setForeground(Color.red);
					if (gpaDouble < 0 || gpaDouble > 4.5) {
						setGpaBoundaryError(true);
					}
					// those if statements check each error flag. If the an error flag is true, error message for the error is added to errorMessage, and changes font color to red.
					if (isNameError()) {
						errorMessage = errorMessage + number + ". You forgot to write your name or surname.\n";
						applicantNameTextBox.setForeground(Color.red);
						number++;
					}
					if (isBirthdayError()) {
						errorMessage = errorMessage + number + ". Birth date must be in 'year/month/day' format.\n";
						birthDateTextBox.setForeground(Color.red);
						number++;
					}
					if (isEmailError()) {
						errorMessage = errorMessage + number + ". Email must be in example@some.some\n";
						emailTextBox.setForeground(Color.red);
						number++;
					}
					if (isGraduateStudentError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter previous university.\n";
						universityTextBox.setForeground(Color.red);
						number++;
					}
					if (isGraduateStudentGpaError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter GPA.\n";
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isGpaBoundaryError()) {
						errorMessage = errorMessage + number + ". GPA must be between 0 and 4.5.\n";
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isBachelorError()) {
						errorMessage = errorMessage + number + ". For undergraduates, you do not have to enter previous university, GPA and graduation year.\n";
						universityTextBox.setForeground(Color.red);
						gpaTextBox.setForeground(Color.red);
						graduationTextBox.setForeground(Color.red);
						number++;
					}
					if (isDegreeError()) {
						errorMessage = errorMessage + number + ". You should write your degree.\n";
						degreeTextBox.setForeground(Color.red);
						universityTextBox.setForeground(Color.red);
						gpaTextBox.setForeground(Color.red);
						number++;
					}
					if (isPhoneNumberError()) {
						errorMessage = errorMessage + number + ". Your phone number should be in '010-XXXX-XXXX' format.\n";
						phoneNumberTextBox.setForeground(Color.red);
						number++;
					}
					if (isMajorError()) {
						errorMessage = errorMessage + number + ". You should write your major.\n";
						majorTextBox.setForeground(Color.red);
						number++;
					}
					if(isStateError()) {
						errorMessage = errorMessage + number + ". You should write your statement more than 100 letters.\n";
						stateTextArea.setForeground(Color.red);
						number++;
					}
					if(isGraduationError()) {
						errorMessage = errorMessage + number + ". For graduates, you have to enter graduation year.\n";
						graduationTextBox.setForeground(Color.red);
						number++;
					}
					if (isAddressError()) {
						errorMessage = errorMessage + number + ". Your address must be in 'number, street, district, city' format.\n";
						homeAddressTextBox.setForeground(Color.red);
						number++;
					}
					//those if statement checks whether error flag is false. If error flag is false, changes the font color to black.
					if (!isNameError()) {
						applicantNameTextBox.setForeground(Color.black);
					}
					if (!isBirthdayError()) {
						//birthDateTextBox.setForeground(Color.black);
					}
					if (!isEmailError()) {
						emailTextBox.setForeground(Color.black);
					}
					if (!isAddressError()) {
						homeAddressTextBox.setForeground(Color.black);
					}
					if (!isPhoneNumberError()) {
						//phoneNumberTextBox.setForeground(Color.black);
					}
					if (!isMajorError()) {
						majorTextBox.setForeground(Color.black);
					}
					if(!isStateError()) {
						stateTextArea.setForeground(Color.black);
					}
					if (!isGraduateStudentError()) {
						universityTextBox.setForeground(Color.black);
					}
					if (!isDegreeError()) {
						degreeTextBox.setForeground(Color.black);
					}
					if (!isBachelorError()&&!isDegreeError()) {
						universityTextBox.setForeground(Color.black);
						//gpaTextBox.setForeground(Color.black);
						//graduationTextBox.setForeground(Color.black);
					}
					
					JOptionPane.showMessageDialog(null, errorMessage, "Error Message", JOptionPane.ERROR_MESSAGE);
				}
				// if every error flags are false, it prints submitted message and delete all the values that are entered.
				if (!isDegreeError()&&!isGraduateStudentError()&&!isGraduateStudentGpaError()&&!isBachelorError()&&!isGpaBoundaryError()&&!isNameError()&&!isBirthdayError()&&!isEmailError()&&!isAddressError()&&!isPhoneNumberError()&&!isMajorError()&&!isStateError()&&!isGraduationError()) {
					applicantNameTextBox.setText("");
					birthDateTextBox.setText("");
					emailTextBox.setText("");
					degreeTextBox.setText("");
					universityTextBox.setText("");
					gpaTextBox.setText("");
					homeAddressTextBox.setText("");
					stateTextArea.setText("");
					phoneNumberTextBox.setText("");
					majorTextBox.setText("");
					graduationTextBox.setText("");
					JOptionPane.showMessageDialog(null,"Successfully submitted!");
				}

			
			}
		});
		btnNewButton.setBackground(new Color(0, 100, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBounds(469, 560, 162, 23);
		contentPane.add(btnNewButton);
		
		birthDateLabel = new JLabel("Birth Date: ");
		birthDateLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		birthDateLabel.setBounds(430, 136, 68, 15);
		contentPane.add(birthDateLabel);
		
		emailLabel = new JLabel("Email: ");
		emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		emailLabel.setBounds(398, 174, 100, 15);
		contentPane.add(emailLabel);
		
		degreeLabel = new JLabel("Degree: ");
		degreeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		degreeLabel.setBounds(398, 210, 100, 15);
		contentPane.add(degreeLabel);
		
		gpaLabel = new JLabel("GPA (for Graduates): ");
		gpaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		gpaLabel.setBounds(355, 285, 143, 15);
		contentPane.add(gpaLabel);
		
		homeAddressLabel = new JLabel("Home Addresss: ");
		homeAddressLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		homeAddressLabel.setBounds(398, 525, 100, 15);
		contentPane.add(homeAddressLabel);
		
		personalStatementLabel = new JLabel("Personal Statement");
		personalStatementLabel.setHorizontalAlignment(SwingConstants.CENTER);
		personalStatementLabel.setBounds(469, 435, 130, 15);
		contentPane.add(personalStatementLabel);
		
		phoneNumberTextBox = new JTextField();
		phoneNumberTextBox.setColumns(10);
		phoneNumberTextBox.setBounds(501, 322, 268, 20);
		contentPane.add(phoneNumberTextBox);
		
		lblPhoneNumber = new JLabel("Phone Number: ");
		lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPhoneNumber.setBounds(355, 327, 143, 15);
		contentPane.add(lblPhoneNumber);
		
		majorTextBox = new JTextField();
		majorTextBox.setColumns(10);
		majorTextBox.setBounds(501, 364, 268, 20);
		contentPane.add(majorTextBox);
		
		lblMajor = new JLabel("Major: ");
		lblMajor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMajor.setBounds(355, 369, 143, 15);
		contentPane.add(lblMajor);
		
		sloganLabel1 = new JLabel("\"예로부터 나라의 인재는 성균에 모여왔으니 ");
		sloganLabel1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		sloganLabel1.setBounds(12, 543, 404, 27);
		contentPane.add(sloganLabel1);
		
		stateTextArea = new JTextArea();
		stateTextArea.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				stateTextArea.setText("");
			}
		});
		stateTextArea.setBackground(new Color(219, 219, 219));
		stateTextArea.setText("At least 100 letters...");
		stateTextArea.setBounds(292, 460, 477, 52);
		contentPane.add(stateTextArea);
		stateTextArea.setLineWrap(true);
		
		sloganLabel2 = new JLabel("그대의 머묾이 우연이겠는가\"");
		sloganLabel2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 12));
		sloganLabel2.setBounds(12, 564, 404, 27);
		contentPane.add(sloganLabel2);
		
		universityLabel = new JLabel("Attended university (for Graduates): ");
		universityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		universityLabel.setBounds(280, 245, 218, 15);
		contentPane.add(universityLabel);
		
		skkuCharacter2 = new JLabel("");
		skkuCharacter2.setIcon(new ImageIcon(ApplicationForm.class.getResource("/img/율전이.jpg")));
		skkuCharacter2.setBounds(292, 294, 100, 128);
		contentPane.add(skkuCharacter2);
		
		skkuCharacter1 = new JLabel("");
		skkuCharacter1.setIcon(new ImageIcon(ApplicationForm.class.getResource("/img/명륜이.jpg")));
		skkuCharacter1.setBounds(292, 87, 100, 148);
		contentPane.add(skkuCharacter1);
		
		graduationTextBox = new JTextField();
		graduationTextBox.setBounds(645, 401, 124, 21);
		contentPane.add(graduationTextBox);
		graduationTextBox.setColumns(10);
		
		graduationLabel = new JLabel("Graduation year (for Graduates)");
		graduationLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		graduationLabel.setBounds(444, 404, 190, 15);
		contentPane.add(graduationLabel);
	}
}
