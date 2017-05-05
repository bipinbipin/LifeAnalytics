<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

<div class="content-container">
    <div class="show-all-btn">Show All</div>

    <%--PHYSIOLOGICAL FIELD--%>
<form:form action="/physiological-submit" method="post" modelAttribute="Phys">

    <div class="physiological field">
        <div class="field-header">
            <h1>Physiological</h1>
        </div>
        <div class="field-content">
            <div class="subfield">
                <h2>Diet</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Vegetable/Fruit</th>
                            <th><input name="vegFruit" type="number"></th>
                        </tr>
                        <tr>
                            <th>Carbohydrate</th>
                            <th><input name="carbohydrate" type="number"></th>
                        </tr>
                        <tr>
                            <th>Dairy</th>
                            <th><input name="dairy" type="number"></th>
                        </tr>
                        <tr>
                            <th>Protein</th>
                            <th><input name="protein" type="number"></th>
                        </tr>
                        <tr>
                            <th>Sugar</th>
                            <th><input name="sugar" type="number"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="dietNotes" type="text" cols="30" rows="3"></textarea>
                </div>
                <h2>Exercise</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Run</th>
                            <th><input name="run" type="number"></th>
                        </tr>
                        <tr>
                            <th>Bike</th>
                            <th><input name="bike" type="number"></th>
                        </tr>
                        <tr>
                            <th>Bench</th>
                            <th><input name="bench" type="number"></th>
                        </tr>
                        <tr>
                            <th>Dips</th>
                            <th><input name="dip" type="number"></th>
                        </tr>
                        <tr>
                            <th>Pull-up</th>
                            <th><input name="pullUp" type="number"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="exerciseNotes" type="text" cols="30" rows="3"></textarea>
                </div>
            </div>
        </div>
    </div>
<button>Submit</button>
</form:form>

    <%--SAFETY FIELD--%>

    <div class="safety field">
        <div class="field-header">
            <h1>Safety</h1>
        </div>
        <div class="field-content">
            <div class="subfield">
                <h2>Health</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Sick</th>
                            <th><input name="sick" type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Energy Level</th>
                            <th><input max="5" min="1" placeholder="1-5"  name="energyLevel" type="number"></th>
                        </tr>
                        <tr>
                            <th>Sleep Hours</th>
                            <th><input max="12" min="1" placeholder="1-12"  name="sleepHours" type="number"></th>
                        </tr>
                        <tr>
                            <th>Sleep Quality</th>
                            <th><input max="5" min="1" placeholder="1-5"  name="sleepQuality" type="number"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="health-notes" type="text" cols="30" rows="3"></textarea>
                </div>
            </div>
            <div class="subfield">
                <h2>Environment</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Temperature</th>
                            <th><input name="temperature" type="number"></th>
                        </tr>
                        <tr>
                            <th>Precipitation</th>
                            <th>
                                <select name="precipitation">
                                    <option value="none">None</option>
                                    <option value="rain">Rain</option>
                                    <option value="storm">Storm</option>
                                    <option value="snow">Snow</option>
                                    <option value="blizzard">Blizzard</option>
                                </select>
                            </th>
                        </tr>
                        <tr>
                            <th>Sun Exposure (min)</th>
                            <th><input name="exposure" type="number"></th>
                        </tr>
                        <tr>
                            <th>Life-Threatening Event</th>
                            <th><input name="lifeThreat" type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Financial Stress</th>
                            <th><input name="financialStress" type="checkbox"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="weather-notes" type="text" cols="30" rows="3"></textarea>
                </div>
            </div>
        </div>
    </div>

    <%--SOCIAL FIELD--%>

    <div class="social field">
        <div class="field-header">
            <h1>Social</h1>
        </div>
        <div class="field-content">
            <div class="subfield">
                <h2>Friendship</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Interactions</th>
                            <th><input type="number" name="interaction-count"></th>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <th><input max="5" min="1" placeholder="1-5" type="number" name="interaction-quality" placeholder="1 - 5"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="social-notes" type="text" cols="30" rows="3"></textarea>
                </div>
                <h2>Intimacy</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Sexual Intimacy</th>
                            <th><input type="checkbox" name="sex"></th>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <th><input max="5" min="1" placeholder="1-5"  type="number" name="sex-quality" placeholder="1 - 5"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="sex-notes" type="text" cols="30" rows="3"></textarea>
                </div>
                <h2>Family</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Family</th>
                            <th><input type="checkbox" name="family"></th>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <th><input max="5" min="1" placeholder="1-5" type="number" name="family-quality" placeholder="1 - 5"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="family-notes" type="text" cols="30" rows="3"></textarea>
                </div>
            </div>
        </div>
    </div>

    <%--ESTEEM FIELD--%>

    <div class="esteem field">
        <div class="field-header">
            <h1>Esteem</h1>
        </div>
        <div class="field-content">
            <div class="subfield">
                <h2>Intellectual</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Reading</th>
                            <th><input type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Video</th>
                            <th><input type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Podcast</th>
                            <th><input type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Conversation</th>
                            <th><input type="checkbox"></th>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <th><input max="5" min="1" placeholder="1-5" type="number"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="intellectual-notes" id="thoughts" cols="30" rows="3"></textarea>
                </div>
                <h2>Work</h2>
                <div class="subfield-contents">
                    <table>
                        <tr>
                            <th>Hours</th>
                            <th><input type="number" id="hours"></th>
                        </tr>
                        <tr>
                            <th>Work Quality</th>
                            <th><input max="5" min="1" placeholder="1-5" type="number" id="work-quality"></th>
                        </tr>
                    </table>
                </div>
                <div class="notes">
                    <textarea placeholder="Notes..." name="work-notes" cols="30" rows="3"></textarea>
                </div>
            </div>
        </div>
    </div>

    <%--ACTUALIZATION FIELD--%>

    <div class="actualization field">
        <div class="field-header">
            <h1>Actualization</h1>
        </div>
        <div class="field-content">
            <div class="subfield">
                <div class="subfield-img">
                    <img src="../../../static/img/level1.jpg" alt="level 1">
                    <img src="../../../static/img/level2.jpg" alt="level 2">
                    <img src="../../../static/img/level3.jpg" alt="level 3">
                    <img src="../../../static/img/level4.jpg" alt="level 4">
                    <img src="../../../static/img/level5.jpg" alt="level 5">
                    <img src="../../../static/img/level6.jpg" alt="level 6">
                    <img src="../../../static/img/level7.jpg" alt="level 7">
                </div>
            </div>
            <h4>Closing Notes</h4>
            <textarea id="closing-thoughts" name="closing-thoughts" ></textarea>
        </div>
    </div>

    <div class="submit-container">
        <button id="submit-final" type="submit">Submit</button>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>