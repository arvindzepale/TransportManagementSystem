<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>AJAX in Struts 2 using JSON and jQuery</title>
<%-- <script language="JavaScript" type="text/javascript" src="/scripts/jquery/jquery-2.1.3.js" ></script> --%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
   $('#country').change(function(event) {
      var country = $("select#country").val();
      $.getJSON('ajaxAction.action', {
        countryName : country
      }, function(jsonResponse) {
        $('#ajaxResponse').text(jsonResponse.dummyMsg);
        var select = $('#states');
        select.find('option').remove();
        $.each(jsonResponse.stateMap, function(key, value) {
          $('<option>').val(key).text(value).appendTo(select);
        });
      });
      });
});
</script>
</head>
<body>
   <h3>AJAX calls to Struts 2 using JSON and jQuery</h3>
   <s:select id="country" name="country"
        list="{'Select Country','India','US'}" label="Select Country" />
   <br />
   <br />
   <s:select id="states" name="states" list="{'Select State'}"
        label="Select State" />
   <br />
   <br />
   <div id="ajaxResponse"></div>
</body>
</html>