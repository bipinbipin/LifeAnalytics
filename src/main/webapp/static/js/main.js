//hide all content fields at page load
$(".field-content").hide();


$(document).ready(function(){


    //set counter for show all
    var counter = true;

    //show all button
    $(".show-all-btn").click(function(){
        if(counter){
            $(this).text("Hide All");
            $(".field-content").slideDown();
            counter = false;
        } else {
            $(this).text("Show All");
            $(".field-content").slideUp();
            counter = true;
        }
    });

    //jQuery accordion menu
    $(".field-header").click(function(){
        $(this).next().slideToggle(300);
    });

});
