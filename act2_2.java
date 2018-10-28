// Activity 2
// Question 2: find the maximum sugarpercentage of fruity candies
String path = "./candy-data.csv";
String allCandyData = readFile(path);
int fruityColIndex = 2;
int sugarPercentColIndex = 10;

boolean isFruity(String rowData) {
  return (intAtColumn(rowData, fruityColIndex) == 0);
}

String fruityRows = filter(allCandyData, r->isFruity(allCandyData));
double maxFruitySugarPercent = maxDouble(fruityRows, sugarPercentColIndex);
