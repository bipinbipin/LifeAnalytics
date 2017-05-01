<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>

<div class="content-container">
    <h1>Physiological</h1><br>
    <div class="physiological field">
        <div class="health subfield">
            <h2>Health:</h2>
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
                <h3>Notes:</h3>
                <textarea name="health-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
        <div class="diet subfield">
            <h2>Diet:</h2>
            <div class="subfield-contents">
                <table>
                    <tr>
                        <th>Sugar</th>
                        <th><input name="sugar" type="number" id="sugars"></th>
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
                        <th>Vegetable/Fruit</th>
                        <th><input name="veg-fruit" type="number" id="veg-fruit"></th>
                    </tr>
                </table>
                <h3>Notes:</h3>
                <textarea name="diet-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
        <div class="exercise subfield">
            <h2>Exercise:</h2>
            <div class="subfield-contents">
                <div class="aerobic">
                    <h3>Aerobic:</h3>
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
                    <h3>Anaerobic:</h3>
                    <table>
                        <tr>
                            <th>Bench</th>
                            <th><input type="number" id="bench"></th>
                        </tr>
                        <tr>
                            <th>Squat</th>
                            <th><input type="number" id="squat"></th>
                        </tr>
                        <tr>
                            <th>Pull-up</th>
                            <th><input type="number" id="pullup"></th>
                        </tr>
                    </table>
                </div>
                <h3>Notes:</h3>
                <textarea name="exercise-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
    </div>
    <h1>Safety</h1><br>
    <div class="safety field">
        <div class="outside subfield">
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
                                <option value="rain">Rain</option>
                                <option value="storm">Storm</option>
                                <option value="snow">Snow</option>
                                <option value="blizzard">Blizzard</option>
                            </select>
                        </th>
                    </tr>
                    <tr>
                        <th>Sun Exposure</th>
                        <th><input type="checkbox" id="exposure"></th>
                    </tr>
                    <tr>
                        <th>Life-Threatening Event</th>
                        <th><input type="checkbox"></th>
                    </tr>
                </table>
                <h3>Notes:</h3>
                <textarea name="exercise-notes" type="text" cols="30" rows="3"></textarea>
            </div>
        </div>
    </div>
    <h1>Intimacy</h1><br>
    <div class="intimacy field">
        <div class="social subfield">
            <h2>Social</h2><br>
            <label for="interaction-count">Count</label>
            <input type="number" id="interaction-count">
        </div>
        <div class="sexual subfield">
            <h2>Sexual</h2><br>
            <input type="checkbox" id="sex">
            <label for="sex">Sex</label>
        </div>
    </div>
    <h1>Esteem</h1><br>
    <div class="esteem field">
        <div class="intellectual subfield">
            <h2>Intellectual</h2><br>
            <input type="checkbox" id="reading">
            <label for="reading">Reading</label><br>
            <input type="checkbox" id="digital">
            <label for="digital">Digital</label><br>
            <label for="thoughts">Thoughts</label><br>
            <textarea name="intellectual-thoughts" id="thoughts" cols="30" rows="10"></textarea>
        </div>
    </div>
    <h1>Actualization</h1><br>
    <div class="actualization field">

    </div>
    <h1>Additional Thoughts</h1>
    <div class="field">
        <div class="closing-thoughts subfield">
            <h2>Thoughts</h2><br>
            <textarea name="closing-thoughts" cols="30" rows="10"></textarea>
        </div>
        <div class="rating subfield">
            <h2>Rating</h2><br>
            <input type="number">
        </div>
    </div>
    <button type="submit">Submit</button>
</div>

<%@include file="../includes/footer.jsp"%>