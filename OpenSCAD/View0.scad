union()
{
    translate([0.9, 0.0, 0.0])
    {
        linear_extrude(height = 10.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([6.5, 6.5])
            {
                M111();
            }
        }
    }
    translate([-3.0, 0.0, 0.0])
    {
        linear_extrude(height = 10.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([5.0, 5.0])
            {
                M52();
            }
        }
    }
    translate([0.0, 1.0, 0.0])
    {
        linear_extrude(height = 1.0, twist = 0.0, scale = 1.0, slices = 1, center = false)
        {
            scale([8.0, 0.5])
            {
                M52();
            }
        }
    }
    translate([-4.0, 0.0, 9.8])
    {
        difference()
        {
            linear_extrude(height = 0.5, twist = 0.0, scale = 1.0, slices = 1, center = false)
            {
                scale([3.0, 2.0])
                {
                    M52();
                }
            }
            linear_extrude(height = 0.5, twist = 0.0, scale = 1.0, slices = 1, center = false)
            {
                scale([2.0999999999999996, 1.4])
                {
                    M52();
                }
            }
        }
    }
}

module M52()
{
    polygon
    (
        points =
        [
            [-0.5, -0.5], 
            [0.5, -0.5], 
            [0.5, 0.5], 
            [-0.5, 0.5]
        ],
        paths =
        [
            [0, 1, 2, 3]
        ]
    );
}

module M111()
{
    polygon
    (
        points =
        [
            [0.5, 0.0], 
            [-0.2499999999999999, 0.43301270189221935], 
            [-0.2500000000000002, -0.4330127018922192]
        ],
        paths =
        [
            [0, 1, 2]
        ]
    );
}
