<%@include file="../includes/header.jsp"%>
<%@include file="../includes/navbar.jsp"%>


<div class="content-container">

    <button class="show-all-analytics">Show All</button>

    <c:forEach var="entry" items="${entries}">

        <div class="entry-container">
            <div class="entry-header">
                <fmt:formatDate value="${entry.entryDate}"></fmt:formatDate>
            </div>
            <div class="entry-content">
                <div class="entry-content-ind">
                    <table>
                        <h3>Diet</h3>
                        <tr>
                            <th>Fruit/Veggies</th>
                            <td>${entry.physiological.diet.veggiesFruit}</td>
                        </tr>
                        <tr>
                            <th>Carbohydrates</th>
                            <td>${entry.physiological.diet.carbohydrates}</td>
                        </tr>
                        <tr>
                            <th>Dairy</th>
                            <td>${entry.physiological.diet.dairy}</td>
                        </tr>
                        <tr>
                            <th>Protein</th>
                            <td>${entry.physiological.diet.protein}</td>
                        </tr>
                        <tr>
                            <th>Sugar</th>
                            <td>${entry.physiological.diet.sugar}</td>
                        </tr>
                        <tr>
                            <th>Diet Notes</th>
                            <td>${entry.physiological.diet.dietNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Exercise</h3>
                        <tr>
                            <th>Run</th>
                            <td>${entry.physiological.exercise.runDistance}</td>
                        </tr>
                        <tr>
                            <th>Bike</th>
                            <td>${entry.physiological.exercise.bikeDistance}</td>
                        </tr>
                        <tr>
                            <th>Bench</th>
                            <td>${entry.physiological.exercise.benchWeight}</td>
                        </tr>
                        <tr>
                            <th>Dips</th>
                            <td>${entry.physiological.exercise.dips}</td>
                        </tr>
                        <tr>
                            <th>Pull-Ups</th>
                            <td>${entry.physiological.exercise.pullUps}</td>
                        </tr>
                        <tr>
                            <th>Exercise Notes</th>
                            <td>${entry.physiological.exercise.exerciseNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Health</h3>
                        <tr>
                            <th>Energy Level</th>
                            <td>${entry.safety.energyLevel}</td>
                        </tr>
                        <tr>
                            <th>Sleep Hours</th>
                            <td>${entry.safety.sleepHours}</td>
                        </tr>
                        <tr>
                            <th>Sleep Quality</th>
                            <td>${entry.safety.sleepQuality}</td>
                        </tr>
                        <tr>
                            <th>Sick?</th>
                            <c:choose>
                                <c:when test="${entry.safety.isSick == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Health Notes</th>
                            <td>${entry.safety.healthNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Environment</h3>
                        <tr>
                            <th>Temperature</th>
                            <td>${entry.safety.temperature}</td>
                        </tr>
                        <tr>
                            <th>Precipitation</th>
                            <td>${entry.safety.precipitation}</td>
                        </tr>
                        <tr>
                            <th>Sun Exposure</th>
                            <td>${entry.safety.sunExposure}</td>
                        </tr>
                        <tr>
                            <th>Life-Threatening Event</th>
                            <c:choose>
                                <c:when test="${entry.safety.lifeThreatened == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Financial Stress</th>
                            <c:choose>
                                <c:when test="${entry.safety.financialStress == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Environment Notes</th>
                            <td>${entry.safety.environmentNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Social Connection</h3>
                        <tr>
                            <th>Interactions</th>
                            <td>${entry.social.interactions}</td>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <td>${entry.social.interactionQuality}</td>
                        </tr>
                        <tr>
                            <th>Social Notes</th>
                            <td>${entry.social.socialNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Intellectual</h3>
                        <tr>
                            <th>Reading</th>
                            <c:choose>
                                <c:when test="${entry.esteem.reading == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Video</th>
                            <c:choose>
                                <c:when test="${entry.esteem.video == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Podcast</th>
                            <c:choose>
                                <c:when test="${entry.esteem.podcast == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Conversation</th>
                            <c:choose>
                                <c:when test="${entry.esteem.conversation == false}">
                                    <td>No</td>
                                </c:when>
                                <c:otherwise>
                                    <td>Yes</td>
                                </c:otherwise>
                            </c:choose>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <td>${entry.esteem.intellectualQuality}</td>
                        </tr>
                        <tr>
                            <th>Intellectual Notes</th>
                            <td>${entry.esteem.intellectualNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <h3>Work</h3>
                        <tr>
                            <th>Hours</th>
                            <td>${entry.esteem.workHours}</td>
                        </tr>
                        <tr>
                            <th>Quality</th>
                            <td>${entry.esteem.workQuality}</td>
                        </tr>
                        <tr>
                            <th>Work Notes</th>
                            <td>${entry.esteem.workNotes}</td>
                        </tr>
                    </table>
                </div>
                <div class="entry-content-ind">
                    <table>
                        <tr>
                            <th>Actualization Level</th>
                            <td>
                                <c:if test="${entry.actualization == 1}">
                                    <img src="../../../static/img/level1.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 2}">
                                    <img src="../../../static/img/level2.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 3}">
                                    <img src="../../../static/img/level3.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 4}">
                                    <img src="../../../static/img/level4.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 5}">
                                    <img src="../../../static/img/level5.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 6}">
                                    <img src="../../../static/img/level6.jpg" >
                                </c:if>
                                <c:if test="${entry.actualization == 7}">
                                    <img src="../../../static/img/level7.jpg" >
                                </c:if>
                            </td>
                        </tr>
                        <h3>Actualization</h3>
                        <tr>
                            <th>Closing Notes</th>
                            <td>${entry.esteem.workNotes}</td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>

    </c:forEach>
</div>


<%@include file="../includes/footer.jsp"%>