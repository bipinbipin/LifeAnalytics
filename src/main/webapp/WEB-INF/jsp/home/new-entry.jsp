<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

<div class="content-container">
    <div class="physiological field">
        <h1>PHYSIOLOGICAL</h1>
        <hr noshade size="1px">
        <div class="subfield">
            <h2>Diet</h2>
            <div class="subfield-contents">
                <table>
                    <tr>
                        <th>Vegetable/Fruit</th>
                        <th><input name="veg-fruit" type="number" id="veg-fruit"></th>
                    </tr>
                    <tr>
                        <th>Protein</th>
                        <th><input name="protein" type="number" id="protein"></th>
                    </tr>
                    <tr>
                        <th>Dairy</th>
                        <th><input name="dairy" type="number" id="dairy"></th>
                    </tr>
                    <tr>
                        <th>Carbohydrate</th>
                        <th><input name="carbs" type="number" id="carbs"></th>
                    </tr>
                    <tr>
                        <th>Sugar</th>
                        <th><input name="sugar" type="number" id="sugars"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="diet-notes" type="text" cols="30" rows="5"></textarea>
            </div>
            <h2>Health</h2>
            <div class="subfield-contents">
                <table>
                    <tr>
                        <th>Sick</th>
                        <th><input name="sick" type="checkbox"></th>
                    </tr>
                    <tr>
                        <th>Energy Level</th>
                        <th><input name="energyLevel" type="number"></th>
                    </tr>
                    <tr>
                        <th>Sleep Hours</th>
                        <th><input name="sleepHours" type="number"></th>
                    </tr>
                    <tr>
                        <th>Sleep Quality</th>
                        <th><input name="sleepQuality" type="number"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="health-notes" type="text" cols="30" rows="5"></textarea>
            </div>
            <h2>Exercise</h2>
            <div class="subfield-contents">
                <div class="aerobic">
                    <h3>Aerobic</h3>
                    <div class="aerobic-select">
                        Ran <select name="run-distance">
                            <option selected value="0">0</option>
                            <option  value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                            <option value="4">4</option>
                            <option value="5">5</option>
                            <option value="6">6</option>
                            <option value="7">7</option>
                            <option value="8">8</option>
                            <option value="9">9</option>
                            <option value="10">10</option>
                        </select> Miles <br><br>
                        Bike <select name="bike-distance">
                            <option selected value="0">0</option>
                            <option value="1">2</option>
                            <option value="2">4</option>
                            <option value="3">6</option>
                            <option value="4">8</option>
                            <option value="5">10</option>
                            <option value="6">12</option>
                            <option value="7">14</option>
                            <option value="8">16</option>
                            <option value="9">18</option>
                            <option value="10">20</option>
                        </select> Miles
                    </div>
                </div>
                <div class="anaerobic">
                    <h3>Anaerobic</h3>
                    <table>
                        <tr>
                            <th>Bench</th>
                            <th><input type="number" id="bench"></th>
                        </tr>
                        <tr>
                            <th>Dips</th>
                            <th><input type="number" id="squat"></th>
                        </tr>
                        <tr>
                            <th>Pull-up</th>
                            <th><input type="number" id="pullup"></th>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="exercise-notes" type="text" cols="30" rows="5"></textarea>
            </div>
        </div>
    </div>
    <div class="safety field">
        <h1>SAFETY</h1>
        <hr noshade size="1px">
        <div class="subfield">
            <h2>Weather</h2>
            <div class="subfield-contents">
                <table>
                    <tr>
                        <th>Temperature</th>
                        <th><input type="number"></th>
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
                        <th><input type="number" id="exposure"></th>
                    </tr>
                    <tr>
                        <th>Life-Threatening Event</th>
                        <th><input type="checkbox"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="weather-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
    </div>
    <div class="social field">
        <h1>SOCIAL</h1>
        <hr noshade size="1px">
        <div class="subfield">
            <h2>Friendships</h2>
            <div class="subfield-contents">
                <table>
                    <tr>
                        <th>Interactions</th>
                        <th><input type="number" name="interaction-count"></th>
                    </tr>
                    <tr>
                        <th>Quality</th>
                        <th><input type="number" name="interaction-quality" placeholder="1 - 5"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="social-notes" type="text" cols="30" rows="3"></textarea>
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
                        <th><input type="number" name="sex-quality" placeholder="1 - 5"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="sex-notes" type="text" cols="30" rows="3"></textarea>
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
                        <th><input type="number" name="family-quality" placeholder="1 - 5"></th>
                    </tr>
                </table>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="family-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
    </div>
    <div class="esteem field">
        <h1>ESTEEM</h1>
        <hr noshade size="1px">
        <div class="subfield">
            <h2>Intellectual</h2>
            <div class="subfield-contents">
                <input type="checkbox" id="reading">
                <label for="reading">Reading</label><br>
                <input type="checkbox" id="digital">
                <label for="digital">Digital</label><br>
            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="intellectual-notes" id="thoughts" cols="30" rows="3"></textarea>
            </div>
            <h2>Work</h2>
            <div class="subfield-contents">

            </div>
            <div class="notes">
                <h3>Notes</h3>
                <textarea name="work-notes" cols="30" rows="3"></textarea>
            </div>
        </div>
    </div>
    <div class="actualization field">
        <h1>ACTUALIZATION</h1>
        <hr noshade size="1px">
        <div class="subfield">
            <img src="../../../static/img/level1.jpg" alt="level 1">
            <img src="../../../static/img/level2.jpg" alt="level 2">
            <img src="../../../static/img/level3.jpg" alt="level 3">
            <img src="../../../static/img/level4.jpg" alt="level 4">
            <img src="../../../static/img/level5.jpg" alt="level 5">
            <img src="../../../static/img/level6.jpg" alt="level 6">
            <img src="../../../static/img/level7.jpg" alt="level 7">
        </div>
    </div>
    <div class="field">
        <h1>CLOSING THOUGHTS</h1>
        <hr noshade size="1px">
        <textarea id="closing-thoughts" name="closing-thoughts" ></textarea>
        <div class="submit-container">
            <button id="submit-final" type="submit">Submit</button>
        </div>
    </div>
</div>

<%@include file="../includes/footer.jsp"%>