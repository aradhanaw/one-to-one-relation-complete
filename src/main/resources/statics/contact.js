function  contact(ContactCount){
    if(dtoCount ==0) {
        dtoCount = ContactCount + 1
    }else{
        dtoCount +=1;
    }
    let html = "<div class=\"form-group mt-2 p-3 custom-card-layout work-experience-content_"+dtoCount+ "\"\>";

    html +=  "<button class=\"btn btn-danger float-right mb-2\" type=\"button\" onclick='remove(" + dtoCount + ")'>Remove</button>";
    html += "<div class=\"form-group\">";
    html += " <label for=\"phonenumber1\" class=\"col-form-label font-weight-normal\">Phone Number</label>\n" +
        " <input type=\"text\" name=\"ContactDTO["+dtoCount+"\].phonenumber1\" class=\"form-control\" id=\"prevCompany\">";
    html += "</div>";
    html += "<div class=\"form-inline\">";
    html += "<div class=\"form-group\">\n" +
        "<label class=\"mr-3 col-form-label font-weight-normal\">Another Phone Number</label>\n" +
        " <input type=\"text\" class=\"form-control\" name=\"ContactDTO["+dtoCount+"\].phonenumber2\"  placeholder=\"Another Phone Number Eg.: Another Phone Number\">\n" +
        "</div>";
    // html +=     "<div class=\"form-group ml-0 ml-sm-auto\">\n" +
    //     " <label class=\"mr-3 col-form-label font-weight-normal\">From</label>\n" +
    //     " <div class=\"input-group\">\n" +
    //     " <div class=\"input-group-prepend\">\n" +
    //     "  <span class=\"input-group-text bg-transparent dateIcon\" id=\"icon\"><i class=\"fas fa-calendar\"></i></span>\n" +
    //     "  </div>\n" +
    //     "  <input type=\"text\" class=\"form-control mydatepicker fromDate bg-transparent\" name=\"workExperienceDTO["+dtoCount+"\].joinDate\" data-date-format=\"yyyy/mm/dd\" readonly>\n" +
    //     "   </div>\n" +
    //     "   </div>\n" +
    //     "   <div class=\"form-group ml-0 ml-sm-auto\">\n" +
    //     "   <label class=\"mr-3 col-form-label font-weight-normal\">To</label>\n" +
    //     "   <div class=\"input-group\">\n" +
    //     "   <div class=\"input-group-prepend\">\n" +
    //     "   <span class=\"input-group-text bg-transparent dateIcon\" id=\"icon\"><i class=\"fas fa-calendar\"></i></span>\n" +
    //     "   </div>\n" +
    //     "   <input type=\"text\" class=\"form-control mydatepicker toDate bg-transparent\" name=\"workExperienceDTO["+dtoCount+"\].leftDate\" data-date-format=\"yyyy/mm/dd\" readonly>\n" +
    //     "   </div>\n" +
    //     "   </div>";
    // html +=     "</div>";
    //
    // html +=     "<div class=\"form-group\">\n" +
    //     "<label for=\"jobDesc col-form-label font-weight-normal\" class=\"col-form-label\">Job Description</label>\n" +
    //     "<textarea class=\"form-control\" name=\"workExperienceDTO["+dtoCount+"\].jobDesc\" id=\"jobDesc\"></textarea>\n" +
    //     "</div>";
    //
    // html +=     "</div>";
    //
    $("#work-experience-wrapper").append(html);

    $(".work-experience-content_"+dtoCount).css({
        "box-shadow": "0 3px 10px rgb(0 0 0 / 20%)",
        "padding":"12px"
    });
}