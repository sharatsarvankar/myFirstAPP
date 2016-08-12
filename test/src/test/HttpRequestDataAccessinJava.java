package src.test;

public class HttpRequestDataAccessinJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> requestParameterValues = new Hashtable<String,String>();
		Hashtable<String,String> changeRequestParameterValues = new Hashtable<String,String>();
		Enumeration<String> parameterNames = inRequest.getParameterNames();
		parameterNames = inRequest.getParameterNames();
		
		while(parameterNames.hasMoreElements()){
		String parameterName = parameterNames.nextElement();
			if(parameterName != null && parameterName.startsWith("TrailerLoad"))
			{
			
				String pullID = parameterName.substring(11, parameterName.length());
				String[] parameterValues = inRequest.getParameterValues(parameterName);
				String[] tempParameterValues = new String[parameterValues.length];
					for (int i = 0; i < parameterValues.length; i++) {
						tempParameterValues[i] =parameterValues[i];
						System.out.println(inRequest.getParameter("H"+pullID) + " ***");
							String pullBasic = inRequest.getParameter("HTrailerLoad"+pullID);
							//System.out.println(" parameterName :: " + parameterName  + " pullBasic :: " + pullBasic );
							if ( pullBasic != null && !tempParameterValues[i].equalsIgnoreCase(pullBasic == null ? "" : pullBasic.toString()))
							{
								changeRequestParameterValues.put(parameterName, tempParameterValues[i]);
								
							}
							//requestParameterValues.put(parameterName, tempParameterValues[i]);
				}
					
			}else if(parameterName != null && !parameterName.startsWith("H")&& !parameterName.startsWith("TrailerLoad"))
			{	
				
				String[] parameterValues = inRequest.getParameterValues(parameterName);
				String[] tempParameterValues = new String[parameterValues.length];
					for (int i = 0; i < parameterValues.length; i++) {
						tempParameterValues[i] =parameterValues[i];
							String pullBasic = inRequest.getParameter("H"+parameterName);
							if ( pullBasic != null && !tempParameterValues[i].equalsIgnoreCase(pullBasic == null ? "" : pullBasic.toString()))
							{
								changeRequestParameterValues.put(""+parameterName, tempParameterValues[i]);
								
							}
						//	requestParameterValues.put(parameterName, tempParameterValues[i]);
				}
			}
		}

		return changeRequestParameterValues;
	}

}
