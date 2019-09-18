
function piResponse() {
    piSetCookie('visitor_id12882', '525397055', 3650);
    piSetCookie('visitor_id12882-hash', '7904dcc6eef18110fb96dcbd0abe50db8f37625109da88f76a35122d5ba585690c86ea3883d2e5be1af07cd7b702baca33864adf', 3650);

    if (document.location.protocol != "https:" || (document.location.protocol == "https:" && true)) {
        var analytics_link = document.location.protocol + "//" + "www2.infosecinstitute.com/analytics?";
        pi.tracker.visitor_id='525397055';

        pi.tracker.visitor_id_sign='7904dcc6eef18110fb96dcbd0abe50db8f37625109da88f76a35122d5ba585690c86ea3883d2e5be1af07cd7b702baca33864adf';

        var variables = 'conly=true';
        for (property in pi.tracker) {
            variables += "&" + property + "=" + encodeURIComponent(pi.tracker[property]);
        }
        var headID = document.getElementsByTagName("head")[0];
        piScriptObj[piScriptNum] = document.createElement('script');
        piScriptObj[piScriptNum].type = 'text/javascript';
        piScriptObj[piScriptNum].src = analytics_link + variables;
        headID.appendChild(piScriptObj[piScriptNum]);
        piScriptObj[piScriptNum].onload = function() { return; }
    }
}
piResponse();




