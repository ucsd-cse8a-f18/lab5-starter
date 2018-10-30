// Activity 2
// Question 1: find the mean winpercent of candies that contain both chocolate AND nuts.

String path = "./candy-data.csv";

int chocolateColIndex = 1;
int nuttyColIndex = 3;
int winPercentColIndex = 12;

boolean hasChocolate(String rowData) {
  return (intAtColumn(rowData, chocolateColIndex) == 1);
}

int isNutty(String rowData) {
  return intAtColumn(rowData, nuttyColIndex);
}

String allCandyData = readFile(path);
String chocolateyCandy = filter(allCandyData, r->hasChocolate(r));
String nuttyCandy = filter(allCandyData, r->isNutty(r));
double meanChocoNuttyWinPercent = meanDouble(nuttyCandy, winPercentColIndex);
