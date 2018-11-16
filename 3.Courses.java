import java.util.Scanner;
public class Courses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter college");
		String college = in.nextLine();
		System.out.println("Enter program");
		String program = in.nextLine();
		// COA
		if(college.equalsIgnoreCase("College of Account") || college.equalsIgnoreCase("COA")) {
			if(program.equalsIgnoreCase("bachelor of science in accounting tecnology") || program.equalsIgnoreCase("BSAT")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
			} 
			else if(program.equalsIgnoreCase("bachelor of science in accountancy") || program.equalsIgnoreCase("BSA")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
		
			}
			else if(program.equalsIgnoreCase("bachelor in accountancy") || program.equalsIgnoreCase("BA")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
		
			} 
			else if(program.equalsIgnoreCase("bachelor of science in foresic accountancy") || program.equalsIgnoreCase("BSFA")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
				System.out.println("The College of Accountancy provides an educational program through which students can prepare themselves for accounting, accounting related endeavors, and increasing levels of responsibility in business and society. Graduates should acquire a broad liberal education, effective personal skills, a life-long quest for knowledge, and a global perspective that will enable them to contribute to their profession and to the world.");
			}
		
		}
		// CBA
		 if(college.equalsIgnoreCase("College of business administration") || college.equalsIgnoreCase("CBA")) {
			
			if(program.equalsIgnoreCase("bachelor of science in business administration") || program.equalsIgnoreCase("BSBA")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
				                        System.out.println("The College of Business Administration aims to develop and enhance world-class graduates in the field of business administration imbued with social responsibilities and humane values. The college has been contributing to the development of skilled professionals as evidenced by graduates employed in government service and private institutions including practitioners in their respective fields of specialization. The college offers: Business Management , Business Economics and Research, Financial Management, Marketing Management, Entrepreneurship and Office Administration .");
			}
			else if (program.equalsIgnoreCase("bachelor of entrepeneurship") || program.equalsIgnoreCase("BE")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
			                         System.out.println("The College of Business Administration aims to develop and enhance world-class graduates in the field of business administration imbued with social responsibilities and humane values. The college has been contributing to the development of skilled professionals as evidenced by graduates employed in government service and private institutions including practitioners in their respective fields of specialization. The college offers: Business Management , Business Economics and Research, Financial Management, Marketing Management, Entrepreneurship and Office Administration .");
			}
			else if (program.equalsIgnoreCase("bachelor in office administration") || program.equalsIgnoreCase("BOA")) {
				//print 
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
				                        System.out.println("The College of Business Administration aims to develop and enhance world-class graduates in the field of business administration imbued with social responsibilities and humane values. The college has been contributing to the development of skilled professionals as evidenced by graduates employed in government service and private institutions including practitioners in their respective fields of specialization. The college offers: Business Management , Business Economics and Research, Financial Management, Marketing Management, Entrepreneurship and Office Administration .");
			}
		
		}
		//CEA
		 if(college.equalsIgnoreCase("College of engineering and architecture") || college.equalsIgnoreCase("CEA")) {
			if(program.equalsIgnoreCase("bachelor of science in architecture")) if( program.equalsIgnoreCase("bachelor in civil engineering")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man. Its contribution to nation building assumes visible form and directly affects regional landscapes. The Engineering & Architecture disciplines cover such an expansive area that comprehensive training in these professions encompasses liberal education as well.");
		
			}
			
			else if(program.equalsIgnoreCase("bachelor in electronic engineering") || program.equalsIgnoreCase("BEE")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
				System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man. Its contribution to nation building assumes visible form and directly affects regional landscapes. The Engineering & Architecture disciplines cover such an expansive area that comprehensive training in these professions encompasses liberal education as well.");
			} 
			else if(program.equalsIgnoreCase("bachelor in computer engineering") || program.equalsIgnoreCase("BCE")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
				System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man. Its contribution to nation building assumes visible form and directly affects regional landscapes. The Engineering & Architecture disciplines cover such an expansive area that comprehensive training in these professions encompasses liberal education as well.");
			}
			else if (program.equalsIgnoreCase("bachelor in environment and sanitary engineering") || program.equalsIgnoreCase("BES")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The college aims to contribute a valuable share in the country's physical development, in the modernization of its infrastructures, and in improving the material comforts of man. Its contribution to nation building assumes visible form and directly affects regional landscapes. The Engineering & Architecture disciplines cover such an expansive area that comprehensive training in these professions encompasses liberal education as well.");
				
			}
		
		
		}
		//CITCS
		 if(college.equalsIgnoreCase("College of information technology and computer science") || college.equalsIgnoreCase("CITCS")) {
			
			if(program.equalsIgnoreCase("bachelor of computer science") || program.equalsIgnoreCase("BSCS")) {
				System.out.println("college department: College of information technology and computer science " );
				System.out.println("bachelor of computer science");
				                        System.out.println("The College is aware that today's technology revolves around the indispensability of the computer in the fields of computations, database systems, web & graphics, networking & security, mobile technology and digital arts.");
			} 
			else if(program.equalsIgnoreCase("bachelor in data analytics") || program.equalsIgnoreCase("BSCS") ) {
				
				System.out.println("college department: College of information technology and computer science   ");
				System.out.println("bachelor in data analytics");
                                System.out.println("The College is aware that today's technology revolves around the indispensability of the computer in the fields of computations, database systems, web & graphics, networking & security, mobile technology and digital arts.");
			
			}
			else if(program.equalsIgnoreCase("bachelor of information technology")|| program.equalsIgnoreCase("BSIT")){
						
					}else if( program.equalsIgnoreCase("Course: bachelor in computer technology")) {
						System.out.println("college department:  "+college );
						System.out.println("program enrolled: "+program);
                                                System.out.println("The College is aware that today's technology revolves around the indispensability of the computer in the fields of computations, database systems, web & graphics, networking & security, mobile technology and digital arts.");
						
			}
		
		}
		
		//CAS
		 if(college.equalsIgnoreCase("College of art and science") || college.equalsIgnoreCase("CAS")) {
		
		
			if(program.equalsIgnoreCase("bachelor of art in english") || program.equalsIgnoreCase("BAE")){
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Arts and Sciences advocates an education directed towards the development of the whole person - one that nurtures the intellectual maturity and moral integrity necessary to face the realities and challenges of a rapidly changing world.");
				
			}
			else if(program.equalsIgnoreCase("bachelor of art in political science") || program.equalsIgnoreCase("BAPS")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Arts and Sciences advocates an education directed towards the development of the whole person - one that nurtures the intellectual maturity and moral integrity necessary to face the realities and challenges of a rapidly changing world.");
				
			}
			else if(program.equalsIgnoreCase("bachelor of art in comunication") || program.equalsIgnoreCase("BAC")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Arts and Sciences advocates an education directed towards the development of the whole person - one that nurtures the intellectual maturity and moral integrity necessary to face the realities and challenges of a rapidly changing world.");
				
			} 
			else if( program.equalsIgnoreCase("bachelor of art inpsychology") || program.equalsIgnoreCase("BAP")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Arts and Sciences advocates an education directed towards the development of the whole person - one that nurtures the intellectual maturity and moral integrity necessary to face the realities and challenges of a rapidly changing world.");
				
			}
		
		
		}
		//CTE
		 if(college.equalsIgnoreCase("College teacher education") || college.equalsIgnoreCase("CTE")) {
			if(program.equalsIgnoreCase("bachelor of science in elementary - general") || program.equalsIgnoreCase("BSE-GEN")) {
		System.out.println("college department:  "+college );
		System.out.println("program enrolled: "+program);
                            System.out.println("The College of Teacher Education firmly believes that teachers constitute the most important resource in the nation's teaching-learning force. As such, they should be imbued with the ideals, aspirations and traditions of Philippine life and culture and should be equipped not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field in line with the institution's goal of providing relevant education");
			
			}
				
			else if( program.equalsIgnoreCase("bachelor of elementary education") || program.equalsIgnoreCase("BEE") ) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Teacher Education firmly believes that teachers constitute the most important resource in the nation's teaching-learning force. As such, they should be imbued with the ideals, aspirations and traditions of Philippine life and culture and should be equipped not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field in line with the institution's goal of providing relevant education.");
				
					}
			else if(program.equalsIgnoreCase("bachelor secondary education") || program.equalsIgnoreCase("BSE")) {
				System.out.println("college department:  "+college );
				System.out.println("program enrolled: "+program);
                                System.out.println("The College of Teacher Education firmly believes that teachers constitute the most important resource in the nation's teaching-learning force. As such, they should be imbued with the ideals, aspirations and traditions of Philippine life and culture and should be equipped not only with the necessary pedagogical skills but also with adequate and updated knowledge in their field in line with the institution's goal of providing relevant education");
				
			}
			
		}
		// error statement
	

	}

}
