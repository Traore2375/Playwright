@upload
Feature: File upload and download

  Scenario: User downloads and uploads a file

    Given the user opens the upload download page "https://demoqa.com/upload-download"
    When the user downloads the sample file
    And the user uploads the downloaded file
    Then the file should be imported successfully