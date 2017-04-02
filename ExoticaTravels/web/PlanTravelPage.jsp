
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Plan Travel Page</title>
    </head>
    <body>
        <div align="right">
            <a href="LogoutServlet">Logout</a>
        </div>

       <form action="PlanTravelServlet">
            <table border="0">
               
                <tr>
                    <td colspan="45">
                        <h2><i>Plan Your Travel</i></h2>
                    </td>
                </tr>
             
            <tr>
            <td>Date of Arrival</td>
            <td>
            <select name="arr_dd" name="arr_date">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
              <option value="31">31</option>
            </select>
            -
            <select name="arr_mm">
              <option value="Jan">January</option>
              <option value="Feb">February</option>
              <option value="Mar">March</option>
              <option value="Apr">April</option>
              <option value="May">May</option>
              <option value="Jun">June</option>
              <option value="Jul">July</option>
              <option value="Aug">August</option>
              <option value="Sep">September</option>
              <option value="Oct">October</option>
              <option value="Nov">November</option>
              <option value="Dec">December</option>
            </select>
            -
            <select name="arr_yy">
              <option value="2013">2013</option>
              <option value="2014">2014</option>
              <option value="2015">2015</option>
              <option value="2016">2016</option>
              <option value="2017">2017</option>
              <option value="2018">2018</option>
              <option value="2019">2019</option>
              <option value="2020">2020</option>
            </select>
            </td>
          </tr>
          <tr>
            <td>Date of Departure</td>
            <td>
            <select name="dep_dd">
              <option value="1">1</option>
              <option value="2">2</option>
              <option value="3">3</option>
              <option value="4">4</option>
              <option value="5">5</option>
              <option value="6">6</option>
              <option value="7">7</option>
              <option value="8">8</option>
              <option value="9">9</option>
              <option value="10">10</option>
              <option value="11">11</option>
              <option value="12">12</option>
              <option value="13">13</option>
              <option value="14">14</option>
              <option value="15">15</option>
              <option value="16">16</option>
              <option value="17">17</option>
              <option value="18">18</option>
              <option value="19">19</option>
              <option value="20">20</option>
              <option value="21">21</option>
              <option value="22">22</option>
              <option value="23">23</option>
              <option value="24">24</option>
              <option value="25">25</option>
              <option value="26">26</option>
              <option value="27">27</option>
              <option value="28">28</option>
              <option value="29">29</option>
              <option value="30">30</option>
              <option value="31">31</option>
            </select>
            -
            <select name="dep_mm">
              <option value="Jan">January</option>
              <option value="Feb">February</option>
              <option value="Mar">March</option>
              <option value="Apr">April</option>
              <option value="May">May</option>
              <option value="Jun">June</option>
              <option value="Jul">July</option>
              <option value="Aug">August</option>
              <option value="Sep">September</option>
              <option value="Oct">October</option>
              <option value="Nov">November</option>
              <option value="Dec">December</option>
            </select>
            -
            <select name="dep_yy">
              <option value="2013">2013</option>
              <option value="2014">2014</option>
              <option value="2015">2015</option>
              <option value="2016">2016</option>
              <option value="2017">2017</option>
              <option value="2018">2018</option>
              <option value="2019">2019</option>
              <option value="2020">2020</option>
            </select>
            </td>
          </tr>
        </table>
            <table>
            <tr>
            <td colspan="2">What kind of Holiday do you prefer?</td>
            </tr>
          <tr>
            <td><input name="kind_wild" type="checkbox" value="Wild and Adventurous" />
              Wild &amp; Adventurous</td>
            <td><input name="kind_romantic" type="checkbox" value="Romantic and Sensuous" />
              Romantic &amp; Sensuous</td>
          </tr>
          <tr>
            <td><input name="kind_fun" type="checkbox" value="Fun and Exciting" />
              Fun &amp; Exciting</td>
            <td><input name="kind_peaceful" type="checkbox" value="Thought provoking and Peaceful" />
                        Thought provoking &amp; Peaceful</td>
          </tr>
          <tr>
            <td><input name="kind_healthy" type="checkbox" value="Healthy and rejuvenating" />
              Healthy &amp; rejuvenating</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="2">What would you like to see in a holiday?</td>
            </tr>
          <tr>
            <td><input name="like_beaches" type="checkbox" value="Beaches" />
              Beaches</td>
            <td><input name="like_archaeological" type="checkbox" value="Archaeological sites" />
              Archaeological sites</td>
          </tr>
          <tr>
            <td><input name="like_mountains" type="checkbox" value="Mountains and waterfalls" />
              Mountains &amp; waterfalls</td>
            <td><input name="like_wildlife" type="checkbox" value="Wild Life" />              
              Wild Life</td>
          </tr>
          <tr>
            <td><input name="like_fauna" type="checkbox" value="Fauna and flora" />
Fauna &amp; flora</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="2">What is the most important facility you need?</td>
            </tr>
          <tr>
            <td><input name="faci_accomodation" type="checkbox" value="Comfortable accommodation" />
              Comfortable accommodation </td>
            <td><input name="faci_food" type="checkbox" value="Excellent food" />
Excellent food</td>
          </tr>
          <tr>
            <td><input name="faci_transport" type="checkbox" value="Transportation" />
Transportation</td>
            <td><input name="faci_comm" type="checkbox"  value="Communication" />
Communication</td>
          </tr>
          <tr>
            <td><input name="faci_guide" type="checkbox" value="Guide assistance" />
Guide assistance</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td>&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
          <tr>
            <td colspan="2">What kind of accommodation pleases you?</td>
            </tr>
          <tr>
            <td><input name="budget" type="checkbox"  value="Budget Guest Houses" />
              Budget Guest Houses</td>
            <td><input name="standard" type="checkbox" value="Standard Hotels" />
Standard Hotels</td>
          </tr>
          <tr>
            <td><input name="star2_3" type="checkbox"  value="2-3 Star Hotels" />
2-3 Star Hotels</td>
            <td><input name="star4_5" type="checkbox"  value="4-5 Star Hotels" />
              4-5 Star Hotels</td>
          </tr>
          <tr>
              <td>&nbsp;</td>
          </tr>
        </table>
        <table border="0">
          <tr>
            <td colspan="2">&nbsp;</td>
          </tr>
          <tr>
          <tr><td><input type="submit"  value="Submit"/></td></tr>
        </table>
    </body>
</html>
