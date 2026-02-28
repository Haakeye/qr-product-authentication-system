package com.example.fake_product;


import java.io.IOException;
import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

	public class Callservice {

		private static String NAMESPACE="http://newpackage/";
		private static String URL="http://192.168.95.1:8080/Product_service/NewWebService?WSDL";

	public static String registerService(String s1, String s2, String s3,
			String s4, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		soap.addProperty("email",s3);
		soap.addProperty("phonenumber",s4);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;

	}
	public static String dregisterService(String s1, String s2, String s3,
			String s4, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		soap.addProperty("phonenumber",s3);
		soap.addProperty("email",s4);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;
	}
	public static String loginService(String s1, String s2, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;

	}

	public static String dloginService(String s1, String s2, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;

	}
	public static String bookService(String qrvalue, String username,
			String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("qrvalue",qrvalue);
		soap.addProperty("username",username);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;

	}
	
	public static String getDeviceList1(String from1,String username,String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("transaction",from1);
		soap.addProperty("username", username);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;

	}
	public static String uloginService(String s1, String s2, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;
	}
	public static String uregisterService(String s1, String s2, String s3,
			String s4, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("username",s1);
		soap.addProperty("password",s2);
		soap.addProperty("email",s3);
		soap.addProperty("phonenumber",s4);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;
	}
	public static String verificationservice(String qrvalue, String method) {
		// TODO Auto-generated method stub
		String restex=null;
		SoapObject soap=new SoapObject(NAMESPACE, method);
		soap.addProperty("qrvalue",qrvalue);
		SoapSerializationEnvelope envelope=new SoapSerializationEnvelope(SoapEnvelope.VER11);
		envelope.setOutputSoapObject(soap);
		HttpTransportSE http=new HttpTransportSE(URL);
		try {
			http.call(NAMESPACE+method, envelope);
			SoapPrimitive primitive =(SoapPrimitive) envelope.getResponse();
			restex=primitive.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
			return "error";
			
		} catch (XmlPullParserException e) {
			e.printStackTrace();
			return "error";
			
		}
		
		return restex;
	}

}
