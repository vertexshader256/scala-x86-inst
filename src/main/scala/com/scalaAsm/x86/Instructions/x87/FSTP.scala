package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Floating Point Value and Pop
// Category: general/datamov

trait FSTP extends InstructionDefinition {
  val mnemonic = "FSTP"
}

object FSTP extends OneOperand[FSTP] with FSTPImpl

trait FSTPImpl extends FSTP {
  implicit object FSTP_0 extends _1[m32] {
    val opcode: OneOpcode = 0xD9 /+ 3
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }

  implicit object FSTP_1 extends _1[m64] {
    val opcode: OneOpcode = 0xDD /+ 3
    val explicitFormat = new RmFormat{}
    override def hasImplicitOperand = true
  }
}
