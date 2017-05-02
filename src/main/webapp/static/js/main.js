$(document).ready(function(){

    $(".actualization-img").click(function(){

        $(this).style("opacity","1.1");
        var test = $(this).attr("id");
        $("#actualization-input").attr("value",test);

    });

});
