<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

<div class="content-container">

    <%@include file="../includes/description.jsp"%>

    <div class="show-all-btn">Show All</div>

    <form:form action="/physiological-submit" method="post" modelAttribute="EntryVO">

        <%--PHYSIOLOGICAL--%>
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

        <%--SAFETY--%>
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
                            <tr>
                                <th>Sick</th>
                                <th><input name="sick" type="checkbox"></th>
                            </tr>
                        </table>
                    </div>
                    <div class="notes">
                        <textarea placeholder="Notes..." name="healthNotes" type="text" cols="30" rows="3"></textarea>
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
                                <th><input name="sunExposure" type="number"></th>
                            </tr>
                            <tr>
                                <th>Life-Threatening Event</th>
                                <th><input name="lifeThreatened" type="checkbox"></th>
                            </tr>
                            <tr>
                                <th>Financial Stress</th>
                                <th><input name="financialStress" type="checkbox"></th>
                            </tr>
                        </table>
                    </div>
                    <div class="notes">
                        <textarea placeholder="Notes..." name="environmentNotes" type="text" cols="30" rows="3"></textarea>
                    </div>
                </div>
            </div>
        </div>

        <%--SOCIAL--%>
        <div class="social field">
            <div class="field-header">
                <h1>Social</h1>
            </div>
            <div class="field-content">
                <div class="subfield">
                    <h2>Social Connection</h2>
                    <div class="subfield-contents">
                        <table>
                            <tr>
                                <th>Interactions</th>
                                <th><input type="number" name="interactions"></th>
                            </tr>
                            <tr>
                                <th>Quality</th>
                                <th><input max="5" min="1" placeholder="1-5" type="number" name="interactionQuality" placeholder="1 - 5"></th>
                            </tr>
                        </table>
                    </div>
                    <div class="notes">
                        <textarea placeholder="Notes..." name="socialNotes" type="text" cols="30" rows="3"></textarea>
                    </div>
                </div>
            </div>
        </div>

        <%--ESTEEM--%>
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
                                <th><input name="reading" type="checkbox"></th>
                            </tr>
                            <tr>
                                <th>Video</th>
                                <th><input name="video" type="checkbox"></th>
                            </tr>
                            <tr>
                                <th>Podcast</th>
                                <th><input name="podcast" type="checkbox"></th>
                            </tr>
                            <tr>
                                <th>Conversation</th>
                                <th><input name="conversation" type="checkbox"></th>
                            </tr>
                            <tr>
                                <th>Quality</th>
                                <th><input name="intellectualQuality" max="5" min="1" placeholder="1-5" type="number"></th>
                            </tr>
                        </table>
                    </div>
                    <div class="notes">
                        <textarea placeholder="Notes..." name="intellectualNotes" id="thoughts" cols="30" rows="3"></textarea>
                    </div>
                    <h2>Work</h2>
                    <div class="subfield-contents">
                        <table>
                            <tr>
                                <th>Hours</th>
                                <th><input name="workHours" type="number"></th>
                            </tr>
                            <tr>
                                <th>Work Quality</th>
                                <th><input name="workQuality" max="5" min="1" placeholder="1-5" type="number"></th>
                            </tr>
                        </table>
                    </div>
                    <div class="notes">
                        <textarea placeholder="Notes..." name="workNotes" cols="30" rows="3"></textarea>
                    </div>
                </div>
            </div>
        </div>

        <%--ACTUALIZATION--%>
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
                    Actualization Level
                    <input required name="actualizationLevel" type="number" >
                </div>
                <h4>Closing Notes</h4>
                <textarea name="closingNotes" class="closingThoughts" ></textarea>
            </div>
        </div>

        <div class="submit-container">
            <button class="submit-final" type="submit">Submit</button>
        </div>

    </form:form>

</div>

<%@include file="../includes/footer.jsp"%>