package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Floating Point Value and Pop
// Category: general/datamov

object FSTP extends InstructionDefinition("FSTP") with FSTPImpl

trait FSTPImpl {
  implicit object FSTP_0 extends FSTP._1[m32] {
    val opcode: OneOpcode = 0xD9 /+ 3
    override def hasImplicitOperand = true
  }

  implicit object FSTP_1 extends FSTP._1[m64] {
    val opcode: OneOpcode = 0xDD /+ 3
    override def hasImplicitOperand = true
  }
}
