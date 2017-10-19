$(document).ready(function () {

    $("#search-form").submit(function (event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();

        fire_ajax_submit();

    });

});

function fire_ajax_submit() {

    var search = {}
    search["username"] = $("#username").val();

    $("#btn-search").prop("disabled", true);

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/search",
        data: JSON.stringify(search),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4><pre>"
                + JSON.stringify(data, null, 4) + "</pre>";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
            $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response</h4><pre>"
                + e.responseText + "</pre>";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
            $("#btn-search").prop("disabled", false);

        }
    });

}

$(document).ready(function(){
    $('input[name="travelType"]').on('change', function() {
        if($(this).attr('id') == 'id_travelType_0' && $(this).is(':checked')) {
            $("#returnDate").attr('disabled', 'true');
            $("#returnDate").val('')
        } else {
            $("#returnDate").removeAttr('disabled');
        }
    })
})

$(function() {
    $("#id_depDate").datetimepicker({
        format: "dd MM yyyy - hh:ii",
        autoclose: true,
        todayBtn: true,
        startDate: "2013-02-14 10:00",
        minuteStep: 10
    });
    
    $("#id_returnDate").datetimepicker({
        format: "dd MM yyyy - hh:ii",
        autoclose: true,
        todayBtn: true,
        startDate: "2013-02-14 10:00",
        minuteStep: 10
    });
    
});

function getFromDestination(elm) {
    var url = "/get_destination/",
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
    var url = "/get_destination/",
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