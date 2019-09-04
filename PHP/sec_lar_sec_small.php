<?php

$elements = [0,3,12, 24, 9, 6, 32, 48];
for( $i = 0; $i<count($elements); $i++)
{
    for( $j = $i+1; $j<count($elements); $j++)
    {
        if($elements[$i]>$elements[$j])
        {
            $temp = $elements[$i];
            $elements[$i] = $elements[$j];
            $elements[$j] = $temp;
        }
    }
}
echo "The second smallest number is: " . $elements[1] . "\n";
echo "The second largest number is: " . $elements[count($elements)-2];