package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Real and Pop
// Category: general/compar

object FCOMP extends InstructionDefinition("FCOMP") with FCOMPImpl

trait FCOMPImpl {
//  implicit object FCOMP_0 extends FCOMP._1[STi/m32] {
//    val opcode: OneOpcode = 0xD8 /+ 3
//    override def hasImplicitOperand = true
//  }

  implicit object FCOMP_1 extends FCOMP._0 {
    val opcode: OneOpcode = 0xD8 /+ 3
    override def hasImplicitOperand = true
  }

  implicit object FCOMP_2 extends FCOMP._1[m64] {
    val opcode: OneOpcode = 0xDC /+ 3
    override def hasImplicitOperand = true
  }
}
