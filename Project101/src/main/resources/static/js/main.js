$( function() {
	$( "#depDt_datepicker" ).datepicker({ 
		minDate: 0,
		defaultDate: 0,
		dateFormat: "yy-mm-dd"
	}).datepicker('setDate', new Date());
} );

$( function() {
	$( "#rtrnDt_datepicker" ).datepicker({ 
		minDate: 0,
		defaultDate: 0,
		dateFormat: "yy-mm-dd"
	}).datepicker('setDate', new Date());
} );

$(document).ready(function() {
	// Get value on change radio function.
	$('input:radio').change(function(){
		var value = $("form input[type='radio']:checked").val();
		if((value == 'multicity') || (value == 'oneway')){
			$("#rtrnDt_datepicker").attr('disabled', 'true');
            $("#rtrnDt_datepicker").val('')
		} else {
			$("#rtrnDt_datepicker").removeAttr('disabled');
		}
	});
});

function getFromDestination(elm) {
    var url = "/getDestination/",
        input = $(elm).children('input[name="fromDest"]'),
        value = input.val();
    $.ajax({
        url: url,
        type: 'GET',
        data: {'q': value},
        success: function(response){
            response = JSON.parse(response)
            console.log(response);
            if (response.status) {
                var available_dest = response.data;
                $( "#id_fromDest" ).autocomplete({
                    source: available_dest
                });
            }
        }
    })
}
function getToDestination(elm) {
    var url = "/getDestination/",
        input = $(elm).children('input[name="toDest"]'),
        value = input.val();
    $.ajax({
        url: url,
        type: 'GET',
        data: {'q': value},
        success: function(response){
            response = JSON.parse(response)
            console.log(response);
            if (response.status) {
                var available_dest = response.data;
                $( "#id_toDest" ).autocomplete({
                    source: available_dest
                });
            }
        }
    })
}